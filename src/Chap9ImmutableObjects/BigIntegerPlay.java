package Chap9ImmutableObjects;

import java.math.BigInteger;
import java.sql.SQLOutput;

public class BigIntegerPlay {


    // rewrite using Biginteger
    public static int pow(int x, int y){
        int prod = 1;
        for(int i = 0; i < y; i++){
            prod  = prod * x;
        }
        return prod;
    }

    public static int fact(int n){
        int prod = 1;

        for (int i = 1; i <= n; i ++){
            prod = prod * i;
        }
        return prod;
    }

    public static BigInteger bigfact(int n){
        BigInteger prod = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            prod = prod.multiply(BigInteger.valueOf(i));
        }
        return prod;
    }


    public static void main(String[] args) {
        System.out.println(bigfact(2000));

        /*
        System.out.println(fact(5) == 120);

        // print the first 15 factorials
        for ( int i = 1; i < 31; i++)
            System.out.printf("%d : %d\n", i, fact(i));

        // Big integers
        BigInteger x = new BigInteger("123456789876543212345678990");
        System.out.println(x.multiply(x).pow(20000));

        */
    }
}
