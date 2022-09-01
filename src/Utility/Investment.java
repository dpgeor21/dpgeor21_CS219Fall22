package Utility;

public class Investment {

    public static double investment(double c, double r, int t, double n){
        return c*Math.pow(1+r/n, t*n);

    }

    public static void main(String [] args){

        double c = 1.0; // initial deposit
        double r = 1.0; // 100% interest
        int t = 1; // number of years
        int n = (int) 2e9; // compounded a billion times
                // here we cast the int to a double

        System.out.println(investment(1.0, 1.0, 1, 2e9));
        System.out.println(investment(25000, .03, 10, 365));
    }
}
