package Crypto;

public class Play {

    public static void main(String [] args){

        System.out.println(3/2);
        System.out.println(-3/2);
        System.out.println(Math.floor(-1.25)); /*floor returns the largest whole
        double that is less than or equal to the argument*/

        System.out.println(-5/2); // int division will give you -2
        System.out.println(Math.floor(-5/2)); // first int division, then floor. floor of -2
        System.out.println(Math.floor(-5/2.0)); // first float division, then floor. floor of -2.5
        /* when values are positive, the floor division is pretty
        much the same as int division except it returns a float*/

        System.out.print(Math.floorDiv(-3, 2)); // First the method does int division, then floor divs it but returns an int

        // remainder play
        System.out.println(-15 % 12);
        System.out.print(-93 % 13);
        System.out.print(Math.floorMod(-15, 12)); // this is what's used for mod with floor division
        System.out.print(Math.floorMod(-93, 13));



    }
}