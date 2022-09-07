package Utility;

import java.util.Scanner;

public class InvestmentCalculator {

    public static void main(String [] args){

        // promt the user for c, r, t, and n
        // call the function with the inputed values

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter initial deposit here: ");
        double deposit = kbd.nextDouble();

        System.out.print("Enter interest rate (decimal): ");
        double interest = kbd.nextDouble();

        System.out.print("Enter number of years: ");
        int years = kbd.nextInt();

        System.out.print("Enter times compounded per year: ");
        double compound = kbd.nextDouble();

        System.out.printf("Your investment is worth $%.2f", Investment.investment(deposit, interest, years, compound));
    }
}
