package ZipCodeDB;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/*
    Holds data about a zipcode
     */
    public class Zipcode implements Comparable<Zipcode>, Distance, WeatherInfo {

    private String code;
    private String state; //two-character code abbreviation
    private String city;
    private double lng;
    private double lat;
    private int pop;

    public double getLat() {
        return lat;
    }

    public Zipcode(String code, String state, String city, double lng, double lat, int pop) {
        this.code = code;
        this.state = state;
        this.city = city;
        this.lng = lng;
        this.lat = lat;
        this.pop = pop;
    }

    @Override
    public String toString() {
        return "Zipcode{" +
                "code='" + code + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", lng=" + lng +
                ", lat=" + lat +
                ", pop=" + pop +
                '}';
    }

    // returns the code which is now public

    public String getCode() {
        return code;
    }

    // implements the compare to method for an array
    // this is the natural ordering for a zipcode
    @Override
    public int compareTo(Zipcode zc) {
        return this.code.compareTo(zc.code);
    }

    @Override
    public double distance(Zipcode zip) {
        return 0; // circle distance which is cool
    }

    public WeatherObservation getWeatherData() {

        //http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat=44&lng=-74&username=edharcourt

        URL url = null; // null is the nothing value
        Scanner s = null;

        String path = "http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat=" + this.lat + "&lng=-"
                + this.lng + "&username=edharcourt\n";


        try {
            url = new URL(path); // create the URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        double humidity = 0, temp = 0, speed = 0;
        String clouds = " ";

        while (s.hasNextLine()) {
            String line = s.nextLine();
            //System.out.println(line);
            if (line.indexOf("humidity") > 0) {
                humidity = Double.parseDouble(line.substring(line.indexOf(":") +
                        2, line.indexOf(",")));
            }
            if (line.indexOf("temperature") > 0) {
                temp = Double.parseDouble(line.substring(line.indexOf(":") + 3, line.indexOf(",") - 1));
            }
            if (line.indexOf("windSpeed") > 0) {
                speed = Double.parseDouble(line.substring(line.indexOf(":") +
                        3, line.indexOf(",") - 1));
            }
            if (line.indexOf("clouds") > 0) {
                clouds = line.substring(line.indexOf(":") +
                        3, line.indexOf(",") - 1);

            }

            // finish this for studying


        }
        WeatherObservation wob = new WeatherObservation(humidity, temp, speed, clouds);
        return wob;
    }
}
