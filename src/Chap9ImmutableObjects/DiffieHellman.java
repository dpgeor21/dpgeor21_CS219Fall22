package Chap9ImmutableObjects;

import java.math.BigInteger;
import java.util.Random;

public class DiffieHellman {

    public static void main(String[] args) {
       Random rng = new Random();

       // get a big prime number
       BigInteger p = new BigInteger("7919");

       // get a private key
        BigInteger Apriv = new BigInteger("123456789");

        // compute public key
        BigInteger Apub = BigInteger.TWO.modPow(Apriv, p);

        // Send to Bob

        // Bob picks his private key
        BigInteger Bpriv = new BigInteger("497");

        // Bob computes his public key
        BigInteger Bpub = BigInteger.TWO.modPow(Bpriv, p);

        // send the key to Alice
        // compute the shared key
        BigInteger Ashared = Bpub.modPow(Apriv, p);
        BigInteger Bshared = Apub.modPow(Bpriv, p);

        System.out.println(Ashared);
        System.out.println(Bshared);
    }
}
