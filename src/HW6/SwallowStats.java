package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class SwallowStats {
    public static void swallow_stats() {

        // first connect to the web page with data
        URL url = null; // null is the nothing value
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt"; // the website you want to access

        try {
            url = new URL(path); // create the URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // What is true? You could connect to the website
        double sum = 0;
        int count = 0;
        double min = 10000;
        double max = 0;
        // read each line of the website

        while (s.hasNextLine()) {
            String line = s.nextLine(); // this will read a line and add it to variable line
            System.out.println(line);
            if (line.indexOf("#") == -1 && line.length() != 0) { // if the hashtag DNE, MODIFY CONDITION
                sum = sum + Double.parseDouble(line); // makes string line into a double
                count++;

                if(Double.parseDouble(line) < min){
                    min = Double.parseDouble(line);
                }
                else if(Double.parseDouble(line) > max){
                    max = Double.parseDouble(line);
                }

            }

        }

        System.out.printf("The average speed of a unladen swallow is %.2f\n", sum / count);
        System.out.printf("The maximum speed is %.2f\n", max);
        System.out.printf("The minimum speed is %.2f\n", min);
    }
    public static void main(String [] args){
        swallow_stats();
    }
}