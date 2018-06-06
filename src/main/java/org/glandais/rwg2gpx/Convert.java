package org.glandais.rwg2gpx;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.glandais.rwg2gpx.json.CoursePoint;
import org.glandais.rwg2gpx.json.PointsOfInterest;
import org.glandais.rwg2gpx.json.RwgContent;
import org.glandais.rwg2gpx.json.TrackPoint;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.jenetics.jpx.GPX;
import io.jenetics.jpx.GPX.Builder;
import io.jenetics.jpx.Route;
import io.jenetics.jpx.Track;
import io.jenetics.jpx.TrackSegment;

public class Convert {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println(" [input (url or json)] [output file (optional)]");
            return;
        }
        String input = readJson(args);
        File outputFile = new File(getOutput(args)).getAbsoluteFile();
        outputFile.getParentFile().mkdirs();

        RwgContent content = getContent(input);

        Builder builder = GPX.builder();
        if (content.getTrackPoints() != null && !content.getTrackPoints().isEmpty()) {
            builder = builder.addTrack(createTrack(content.getTrackPoints()));
        }
        if (content.getCoursePoints() != null && !content.getCoursePoints().isEmpty()) {
            builder = builder.addRoute(createRoute(content.getCoursePoints()));
        }
        if (content.getPointsOfInterest() != null && !content.getPointsOfInterest().isEmpty()) {
            for (PointsOfInterest poi : content.getPointsOfInterest()) {
                builder = builder.addWayPoint(wp -> updateWaypoint(wp, poi));
            }
        }
        GPX gpx = builder.build();
        GPX.write(gpx, outputFile.toPath());
    }

    private static Track createTrack(List<TrackPoint> trackPoints) {
        io.jenetics.jpx.TrackSegment.Builder segmentBuilder = TrackSegment.builder();
        for (TrackPoint trackPoint : trackPoints) {
            segmentBuilder.addPoint(p -> updateTrackPoint(p, trackPoint));
        }
        return Track.builder().addSegment(segmentBuilder.build()).build();
    }

    protected static void updateTrackPoint(io.jenetics.jpx.WayPoint.Builder p, TrackPoint trackPoint) {
        p.lon(trackPoint.getX()).lat(trackPoint.getY());
        if (trackPoint.getE() != null) {
            p.ele(trackPoint.getE());
        }
    }

    private static Route createRoute(List<CoursePoint> coursePoints) {
        io.jenetics.jpx.Route.Builder routeBuilder = Route.builder();
        for (CoursePoint routePoint : coursePoints) {
            routeBuilder.addPoint(p -> updateRoutePoint(p, routePoint));
        }
        return routeBuilder.build();
    }

    private static void updateRoutePoint(io.jenetics.jpx.WayPoint.Builder p, CoursePoint routePoint) {
        p.lon(routePoint.getX()).lat(routePoint.getY());
        if (routePoint.getT() != null) {
            p.desc(routePoint.getT());
        }
        if (routePoint.getN() != null) {
            p.name(routePoint.getN());
        }
    }

    private static void updateWaypoint(io.jenetics.jpx.WayPoint.Builder p, PointsOfInterest poi) {
        p.lon(poi.getLng()).lat(poi.getLat());
        if (poi.getPoiType() != null) {
            p.sym(String.valueOf(poi.getPoiType()));
        }
        if (poi.getName() != null) {
            p.name(poi.getName());
        }
        if (poi.getUrl() != null) {
            p.addLink(String.valueOf(poi.getUrl()));
        }
        if (poi.getDescription() != null) {
            p.desc(poi.getDescription());
        }
    }

    protected static RwgContent getContent(String input) throws IOException {
        ObjectMapper om = new ObjectMapper();
        return om.readValue(input, RwgContent.class);
    }

    protected static String readJson(String[] args) throws IOException {
        String input = args[0];
        if (input.startsWith("http")) {
            if (!input.endsWith(".json")) {
                input = input + ".json";
            }
            try (InputStream in = new URL(input).openStream()) {
                input = IOUtils.toString(in, StandardCharsets.UTF_8);
            }
        } else {
            File inputFile = new File(input);
            if (!inputFile.exists()) {
                System.out.println(input + " doesn't exist");
                throw new IOException(input + " doesn't exist");
            }
            input = FileUtils.readFileToString(inputFile, StandardCharsets.UTF_8);
        }
        return input;
    }

    protected static String getOutput(String[] args) {
        String output;
        if (args.length > 1) {
            output = args[1];
        } else {
            output = args[0];
            if (output.endsWith(".json")) {
                // FIXME poor replace
                output = output.replace(".json", ".gpx");
            }
            if (!output.endsWith(".gpx")) {
                output = output + ".gpx";
            }
            output = removePath(output, '/');
            output = removePath(output, '\\');
        }
        return output;
    }

    protected static String removePath(String output, char c) {
        if (output.lastIndexOf(c) > 0) {
            return output.substring(output.lastIndexOf(c) + 1, output.length());
        } else {
            return output;
        }
    }

}
