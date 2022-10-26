package ArrayExamples;

import java.util.Arrays;
import java.util.Random;

public class CardDeck {

    // function that builds the card deck
    public static String [] build_deck(){
        String [] suits = {"\u2660", "\u2665", "\u2666", "\u2663"};
        String [] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "J", "K", "Q"};

        String [] deck = new String[suits.length * ranks.length];
        int i = 0;

        for (String suit : suits){
            // for each suit in suits
            for (String rank : ranks){ // for ranks in ranks
                deck[i++] = suit + rank;
            }
        }
        return deck;

    }

    // function that shuffles the deck
    public static String [] shuffle_deck(String [] aos){
        Random rng = new Random();
        for (int i = 0; i < aos.length - 1; i++){
            int r = rng.nextInt(i, aos.length);
            // need a temporary variable sp we don't lose aos[i]
            String temp = aos[i];
            aos[i] = aos[r];
            aos[r] = temp; //12345678910
        }
        return aos;
    }

    public static void main(String[] args) {
        String [] deck = build_deck();
        System.out.println(Arrays.toString(build_deck()));
        System.out.println(Arrays.toString(shuffle_deck(deck)));

    }
}
