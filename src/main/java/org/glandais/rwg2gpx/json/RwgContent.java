
package org.glandais.rwg2gpx.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "highlighted_photo_id",
    "distance",
    "elevation_gain",
    "elevation_loss",
    "track_id",
    "user_id",
    "pavement_type",
    "pavement_type_id",
    "recreation_type_ids",
    "visibility",
    "created_at",
    "updated_at",
    "name",
    "description",
    "first_lng",
    "first_lat",
    "last_lat",
    "last_lng",
    "bounding_box",
    "locality",
    "postal_code",
    "administrative_area",
    "country_code",
    "privacy_code",
    "user",
    "photo_ids",
    "points_of_interest",
    "course_points",
    "track_points"
})
public class RwgContent {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("highlighted_photo_id")
    private Integer highlightedPhotoId;
    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("elevation_gain")
    private Double elevationGain;
    @JsonProperty("elevation_loss")
    private Double elevationLoss;
    @JsonProperty("track_id")
    private String trackId;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("pavement_type")
    private String pavementType;
    @JsonProperty("pavement_type_id")
    private Integer pavementTypeId;
    @JsonProperty("recreation_type_ids")
    private List<Integer> recreationTypeIds = new ArrayList<Integer>();
    @JsonProperty("visibility")
    private Integer visibility;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("updated_at")
    private Integer updatedAt;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("first_lng")
    private Double firstLng;
    @JsonProperty("first_lat")
    private Double firstLat;
    @JsonProperty("last_lat")
    private Double lastLat;
    @JsonProperty("last_lng")
    private Double lastLng;
    @JsonProperty("bounding_box")
    private List<BoundingBox> boundingBox = new ArrayList<BoundingBox>();
    @JsonProperty("locality")
    private String locality;
    @JsonProperty("postal_code")
    private String postalCode;
    @JsonProperty("administrative_area")
    private String administrativeArea;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("privacy_code")
    private Object privacyCode;
    @JsonProperty("user")
    private Object user;
    @JsonProperty("photo_ids")
    private List<Object> photoIds = new ArrayList<Object>();
    @JsonProperty("points_of_interest")
    private List<PointsOfInterest> pointsOfInterest = new ArrayList<PointsOfInterest>();
    @JsonProperty("course_points")
    private List<CoursePoint> coursePoints = new ArrayList<CoursePoint>();
    @JsonProperty("track_points")
    private List<TrackPoint> trackPoints = new ArrayList<TrackPoint>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public RwgContent withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("highlighted_photo_id")
    public Integer getHighlightedPhotoId() {
        return highlightedPhotoId;
    }

    @JsonProperty("highlighted_photo_id")
    public void setHighlightedPhotoId(Integer highlightedPhotoId) {
        this.highlightedPhotoId = highlightedPhotoId;
    }

    public RwgContent withHighlightedPhotoId(Integer highlightedPhotoId) {
        this.highlightedPhotoId = highlightedPhotoId;
        return this;
    }

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public RwgContent withDistance(Double distance) {
        this.distance = distance;
        return this;
    }

    @JsonProperty("elevation_gain")
    public Double getElevationGain() {
        return elevationGain;
    }

    @JsonProperty("elevation_gain")
    public void setElevationGain(Double elevationGain) {
        this.elevationGain = elevationGain;
    }

    public RwgContent withElevationGain(Double elevationGain) {
        this.elevationGain = elevationGain;
        return this;
    }

    @JsonProperty("elevation_loss")
    public Double getElevationLoss() {
        return elevationLoss;
    }

    @JsonProperty("elevation_loss")
    public void setElevationLoss(Double elevationLoss) {
        this.elevationLoss = elevationLoss;
    }

    public RwgContent withElevationLoss(Double elevationLoss) {
        this.elevationLoss = elevationLoss;
        return this;
    }

    @JsonProperty("track_id")
    public String getTrackId() {
        return trackId;
    }

    @JsonProperty("track_id")
    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public RwgContent withTrackId(String trackId) {
        this.trackId = trackId;
        return this;
    }

    @JsonProperty("user_id")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public RwgContent withUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("pavement_type")
    public String getPavementType() {
        return pavementType;
    }

    @JsonProperty("pavement_type")
    public void setPavementType(String pavementType) {
        this.pavementType = pavementType;
    }

    public RwgContent withPavementType(String pavementType) {
        this.pavementType = pavementType;
        return this;
    }

    @JsonProperty("pavement_type_id")
    public Integer getPavementTypeId() {
        return pavementTypeId;
    }

    @JsonProperty("pavement_type_id")
    public void setPavementTypeId(Integer pavementTypeId) {
        this.pavementTypeId = pavementTypeId;
    }

    public RwgContent withPavementTypeId(Integer pavementTypeId) {
        this.pavementTypeId = pavementTypeId;
        return this;
    }

    @JsonProperty("recreation_type_ids")
    public List<Integer> getRecreationTypeIds() {
        return recreationTypeIds;
    }

    @JsonProperty("recreation_type_ids")
    public void setRecreationTypeIds(List<Integer> recreationTypeIds) {
        this.recreationTypeIds = recreationTypeIds;
    }

    public RwgContent withRecreationTypeIds(List<Integer> recreationTypeIds) {
        this.recreationTypeIds = recreationTypeIds;
        return this;
    }

    @JsonProperty("visibility")
    public Integer getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public RwgContent withVisibility(Integer visibility) {
        this.visibility = visibility;
        return this;
    }

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public RwgContent withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("updated_at")
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public RwgContent withUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public RwgContent withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public RwgContent withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("first_lng")
    public Double getFirstLng() {
        return firstLng;
    }

    @JsonProperty("first_lng")
    public void setFirstLng(Double firstLng) {
        this.firstLng = firstLng;
    }

    public RwgContent withFirstLng(Double firstLng) {
        this.firstLng = firstLng;
        return this;
    }

    @JsonProperty("first_lat")
    public Double getFirstLat() {
        return firstLat;
    }

    @JsonProperty("first_lat")
    public void setFirstLat(Double firstLat) {
        this.firstLat = firstLat;
    }

    public RwgContent withFirstLat(Double firstLat) {
        this.firstLat = firstLat;
        return this;
    }

    @JsonProperty("last_lat")
    public Double getLastLat() {
        return lastLat;
    }

    @JsonProperty("last_lat")
    public void setLastLat(Double lastLat) {
        this.lastLat = lastLat;
    }

    public RwgContent withLastLat(Double lastLat) {
        this.lastLat = lastLat;
        return this;
    }

    @JsonProperty("last_lng")
    public Double getLastLng() {
        return lastLng;
    }

    @JsonProperty("last_lng")
    public void setLastLng(Double lastLng) {
        this.lastLng = lastLng;
    }

    public RwgContent withLastLng(Double lastLng) {
        this.lastLng = lastLng;
        return this;
    }

    @JsonProperty("bounding_box")
    public List<BoundingBox> getBoundingBox() {
        return boundingBox;
    }

    @JsonProperty("bounding_box")
    public void setBoundingBox(List<BoundingBox> boundingBox) {
        this.boundingBox = boundingBox;
    }

    public RwgContent withBoundingBox(List<BoundingBox> boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    @JsonProperty("locality")
    public String getLocality() {
        return locality;
    }

    @JsonProperty("locality")
    public void setLocality(String locality) {
        this.locality = locality;
    }

    public RwgContent withLocality(String locality) {
        this.locality = locality;
        return this;
    }

    @JsonProperty("postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public RwgContent withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    @JsonProperty("administrative_area")
    public String getAdministrativeArea() {
        return administrativeArea;
    }

    @JsonProperty("administrative_area")
    public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    public RwgContent withAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
        return this;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public RwgContent withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    @JsonProperty("privacy_code")
    public Object getPrivacyCode() {
        return privacyCode;
    }

    @JsonProperty("privacy_code")
    public void setPrivacyCode(Object privacyCode) {
        this.privacyCode = privacyCode;
    }

    public RwgContent withPrivacyCode(Object privacyCode) {
        this.privacyCode = privacyCode;
        return this;
    }

    @JsonProperty("user")
    public Object getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(Object user) {
        this.user = user;
    }

    public RwgContent withUser(Object user) {
        this.user = user;
        return this;
    }

    @JsonProperty("photo_ids")
    public List<Object> getPhotoIds() {
        return photoIds;
    }

    @JsonProperty("photo_ids")
    public void setPhotoIds(List<Object> photoIds) {
        this.photoIds = photoIds;
    }

    public RwgContent withPhotoIds(List<Object> photoIds) {
        this.photoIds = photoIds;
        return this;
    }

    @JsonProperty("points_of_interest")
    public List<PointsOfInterest> getPointsOfInterest() {
        return pointsOfInterest;
    }

    @JsonProperty("points_of_interest")
    public void setPointsOfInterest(List<PointsOfInterest> pointsOfInterest) {
        this.pointsOfInterest = pointsOfInterest;
    }

    public RwgContent withPointsOfInterest(List<PointsOfInterest> pointsOfInterest) {
        this.pointsOfInterest = pointsOfInterest;
        return this;
    }

    @JsonProperty("course_points")
    public List<CoursePoint> getCoursePoints() {
        return coursePoints;
    }

    @JsonProperty("course_points")
    public void setCoursePoints(List<CoursePoint> coursePoints) {
        this.coursePoints = coursePoints;
    }

    public RwgContent withCoursePoints(List<CoursePoint> coursePoints) {
        this.coursePoints = coursePoints;
        return this;
    }

    @JsonProperty("track_points")
    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    @JsonProperty("track_points")
    public void setTrackPoints(List<TrackPoint> trackPoints) {
        this.trackPoints = trackPoints;
    }

    public RwgContent withTrackPoints(List<TrackPoint> trackPoints) {
        this.trackPoints = trackPoints;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public RwgContent withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(highlightedPhotoId).append(distance).append(elevationGain).append(elevationLoss).append(trackId).append(userId).append(pavementType).append(pavementTypeId).append(recreationTypeIds).append(visibility).append(createdAt).append(updatedAt).append(name).append(description).append(firstLng).append(firstLat).append(lastLat).append(lastLng).append(boundingBox).append(locality).append(postalCode).append(administrativeArea).append(countryCode).append(privacyCode).append(user).append(photoIds).append(pointsOfInterest).append(coursePoints).append(trackPoints).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RwgContent) == false) {
            return false;
        }
        RwgContent rhs = ((RwgContent) other);
        return new EqualsBuilder().append(id, rhs.id).append(highlightedPhotoId, rhs.highlightedPhotoId).append(distance, rhs.distance).append(elevationGain, rhs.elevationGain).append(elevationLoss, rhs.elevationLoss).append(trackId, rhs.trackId).append(userId, rhs.userId).append(pavementType, rhs.pavementType).append(pavementTypeId, rhs.pavementTypeId).append(recreationTypeIds, rhs.recreationTypeIds).append(visibility, rhs.visibility).append(createdAt, rhs.createdAt).append(updatedAt, rhs.updatedAt).append(name, rhs.name).append(description, rhs.description).append(firstLng, rhs.firstLng).append(firstLat, rhs.firstLat).append(lastLat, rhs.lastLat).append(lastLng, rhs.lastLng).append(boundingBox, rhs.boundingBox).append(locality, rhs.locality).append(postalCode, rhs.postalCode).append(administrativeArea, rhs.administrativeArea).append(countryCode, rhs.countryCode).append(privacyCode, rhs.privacyCode).append(user, rhs.user).append(photoIds, rhs.photoIds).append(pointsOfInterest, rhs.pointsOfInterest).append(coursePoints, rhs.coursePoints).append(trackPoints, rhs.trackPoints).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
