package Exam2Study;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static HW7.HW7.make_array;

public class testPracticeCode {

    public static String [] load_words(String path , int n){
        // first connect to the web page with data
        URL url = null; // null is the nothing value
        Scanner s = null;


        try {
            url = new URL(path); // create the URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // create an array of strings for the website
        String [] words = new String[n];

        int i = 0;
        while (s.hasNextLine()){
            words[i++] = s.nextLine();
        }
        return words;
    }

    public static void jumble(String s){
        char [] answer = make_array(s);


    }



    public static void main(String[] args) {
        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2309);
        System.out.println(Arrays.toString(words));

        Random rng = new Random();
        int r = rng.nextInt(0, words.length);
        String answer = words[r];
        System.out.println(answer);
        jumble(answer);

    }
}
