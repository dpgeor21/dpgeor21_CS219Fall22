package UnladenSwallowSpeed;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class AverageSpeed {
    public static double avg_swallow_speed() {

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
        // read each line of the website
        while (true) {
            if (!s.hasNextLine())
                break;

            String line = s.nextLine(); // this will read a line and add it to variable line
            System.out.println(line);
            if (line.indexOf("#") == -1 && line.length() == 0) { // if the hashtag DNE, MODIFY CONDITION
                sum = sum + Double.parseDouble(line); // makes string line into a double
                count++;

            }

        }
        return sum / count;
    }
    public static void main(String [] args){
        System.out.printf("Average swallow speed is %.2f\n", avg_swallow_speed());
    }
}