package Exam2Study;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Studycode {

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

    public static String s_string(String s, char z) {
        String sub = null;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == z) {
                sub = s.substring(0, i);
            }
        }
        return sub;
    }

    public static boolean hasDuplicate(String [] aos){
        for(int i = 0; i < aos.length - 1; i ++){
            for(int j = i + 1; j < aos.length; j++){
                if(aos[i].toLowerCase().equals(aos[j].toLowerCase())){
                    return true;
                }
            }
        }
        return false;
    }
    public static int [] make(){
        int [] aoi = new int [5];
        for (int i = 0; i < aoi.length; i++){
            aoi[i] = i + 1;
        }
        return aoi;
    }

    public static int [] dub(int [] aoi){
        for(int i = 0; i < aoi.length; i++){
            aoi[i] = aoi[i] * 2;
        }
        return aoi;
    }

    public static int mus(int [] aoi){
        int sum = 0;
        for(int i = 0; i < aoi.length; i++){
            sum += aoi[i];
        }
        return sum;
    }

    public static boolean areFactors(int n, int [] aoi){
        for(int i = 0; i < aoi.length; i++){
            if(aoi[i] % 2 == 0)
                return true;
        }
        return false;
    }

    public static int pow(int x, int y){
        if (y == 0)
            return 1;
        else
            return (x * pow(x, y - 1));
    }

    public static void wordle_cheat(String [] words){
        for (String w : words){
            if (w.length() == 5 &&
            w.charAt(0) == 't' &&
            w.charAt(4) == 'r'){
                String middle = w.substring(1, 4);
                if (middle.indexOf('s') > -1){
                    System.out.println(w);
                }
            }

        }
    }

    public static void main(String[] args) {

        char char1 = 'z';
        String s2 = "bazooka";
        String s = "bamboozled";
        System.out.println(s_string(s, char1).equals("bamboo"));
        System.out.println(s_string(s2, char1).equals("ba"));

        char ch1 = '7';
        char ch2 = '9';

        System.out.println(Math.floorMod(-22, 5));
        System.out.println(Math.floorMod(17, 3));
        System.out.println(-17%3);
        System.out.println(17%-3);

        System.out.println(Math.floorDiv(7, 99));
        System.out.println(Math.floorDiv(5, 2));
        System.out.println(Math.floorDiv(-5, 2));

        String [] aos = {"Harry", "Mary", "Larry", "Gerry", "Terry", "larry"};
        System.out.println(hasDuplicate(aos));

        System.out.println(mus(dub(make())) == 30);

        System.out.println(pow(2, 6) == 64);

        String[] word = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2309);
        wordle_cheat(word);

        System.out.println(25%2);

    }
}
