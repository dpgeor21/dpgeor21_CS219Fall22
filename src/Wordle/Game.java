package Wordle;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class Game {

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

    // return the index of target in aos
    public static int indexOf(String target, String [] aos) {

        for(int i = 0; i < aos.length; i++){
            if (aos[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
    // return the location of target between low and high

    public static int binary_search(String [] aos, int low, int high, String target) {

        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (aos[mid].equals(target))
            return mid;
        else if (aos[mid].compareTo(target) < 0) // this means aos[mid] is less than target
            return(binary_search(aos, mid + 1, high, target)); // mid plus one is now the next low
        else
            return(binary_search(aos, low, mid - 1, target)); // mid minus one is now the next high

    }

    public static void main(String[] args) {
        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2309);

        Random rng = new Random();

        rng.setSeed(23);
        String word = words[rng.nextInt(0, words.length)];
        System.out.println(word);

        // find the location of word in words
        System.out.println(indexOf(word, words));

        System.out.println(binary_search(words, 0, words.length - 1, word));
    }
}