package Crypto;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Stream {

    public static String E(String cleartext, int key, boolean encrypt){
        String ciphertext = "";
        final int alphalength = 126 - 32 + 1; // this should never change
        final char base_char = ' ';

        SecureRandom rng = null; // this is our new key, all this does is constructs an object (makes a generator of random numbers)
        try {
            rng = SecureRandom.getInstance("SHA1PRNG"); // This is throwing it or something
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        rng.setSeed(key); // this is seeding the random number generator


        for (int i = 0; i < cleartext.length(); i++){

            char clear_char = cleartext.charAt(i);
            int clear_char_pos = clear_char - base_char; // this tells us where in the alphabet the character is, space is the starting character
            int shift = rng.nextInt(100);
            if(!encrypt)
                shift = -shift;
            int cipher_char_pos = Math.floorMod(clear_char_pos + shift, alphalength) + base_char; /*We have to use floor mod
                                        for clock erythematic, this allows us to add the key to a letter like z*/
            char cipher_char = (char)cipher_char_pos;
            ciphertext = ciphertext + cipher_char;

        }
        return ciphertext;
    }




    public static void main(String [] args){
        System.out.println(E("java", 10, true)); // you must use the .equals to compare strings
        System.out.println(E("j\\?v", 10, false));
    }
}