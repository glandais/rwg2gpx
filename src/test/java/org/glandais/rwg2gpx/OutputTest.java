package org.glandais.rwg2gpx;

public class OutputTest {

    public static void main(String[] args) {
        check("11111.json");
        check("C:\\tmp\\11111.json");
        check("/tmp/11111.json");
        check("https://ridewithgps.com/routes/11111");
        check("https://ridewithgps.com/routes/11111.json");
    }

    protected static void check(String input) {
        assert Convert.getOutput(new String[] { input }).equals("11111.gpx");
    }

}
