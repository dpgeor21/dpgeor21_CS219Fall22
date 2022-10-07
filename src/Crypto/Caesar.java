package Crypto;

public class Caesar {

    public static String E(String cleartext, int key){
        String ciphertext = "";
        final int alphalength = 26; // this should never change

        for (int i = 0; i < cleartext.length(); i++){

            char clear_char = cleartext.charAt(i);
            int clear_char_pos = clear_char - 'a'; // this tells us where in the alphabet the character is
            int cipher_char_pos = Math.floorMod(clear_char_pos + key, alphalength) + 'a'; /*We have to use floor mod
                                        for clock erythematic, this allows us to add the key to a letter like z*/
            char cipher_char = (char)cipher_char_pos;
            ciphertext = ciphertext + cipher_char;

        }
        return ciphertext;
    }

    public static String D(String cipher, int key){
        String cleartext = "";
        final int alphalength = 26;

        for (int i = 0; i < cipher.length(); i ++){

            char cipher_char = cipher.charAt(i);
            int cipher_char_pos = cipher_char - 'a';
            int clear_char_pos = Math.floorMod(cipher_char_pos - key, alphalength);

            char clear_char = (char)(clear_char_pos + 'a');
            cleartext += clear_char;
        }
        return cleartext;
    }

    public static String d(String cipher, int key){
        return E(cipher, - key);
    }

    public static void main(String [] args){
        System.out.println(E("cold", 20).equals( "wifx")); // you must use the .equals to compare strings

        System.out.println(D(E("cold", 20), 20).equals("cold"));

        System.out.println(d(E("cold", 20), 20).equals("cold"));
    }
}