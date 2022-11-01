package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;


public class Exam {

    public static boolean isPalindrome2(String s) {
        if (s.length() < 2)
            return true;
        else if (s.charAt(0) == s.charAt(s.length() - 1) &&
                isPalindrome2(s.substring(1, s.length() - 1)))
            return true;
        else
            return false;
    }
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
        String [] pal = new String[9];

        int k = 0;
        while (s.hasNextLine()){
            words[k++] = s.nextLine();
        }
        int j = 0;
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if (isPalindrome2(word)){
                pal[j] = word;
                j+=1;
            }
        }
        Arrays.sort(pal);
        for(int i = 0; i < (pal.length -1) / 2; i++){
            String temp  =pal[i];
            pal[i] = pal[pal.length - 1 -  i];
            pal[pal.length - 1 - i] = temp;
        }





        return pal;
    }




    public static void main(String[] args) {

        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2309);

        System.out.println(Arrays.toString(words));
    }
}
