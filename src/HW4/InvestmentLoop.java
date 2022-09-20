package HW4;

import java.util.Scanner;

public class InvestmentLoop {

    public static double investment(double c, double r, int t, double n) {
        return c * Math.pow(1 + r / n, t * n);

    }


    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        double deposit;
        double interest;
        int years;
        double comp;

        while (true){
            System.out.print("Enter your initial deposit: ");
            if (kbd.hasNextDouble()){
                deposit = kbd.nextDouble();
                if (deposit < 0 ){
                    System.out.printf("Please enter a positive number. You entered \"%.1f\"", deposit);
                }
                else{
                    break;
                }
            }
            else{
                System.out.printf("Error. Double expected. You entered \"%s\"", kbd.next());

            }
        }

        while (true){
            System.out.print("Enter your interest rate: ");
            if (kbd.hasNextDouble()){
                interest = kbd.nextDouble();
                if (interest < 0 || interest > 1){
                    System.out.printf("Please enter a positive number less than 1. You entered \"%.1f\"", interest);
                }
                else{
                    break;
                }
            }
            else{
                System.out.printf("Error. Number between 0 and 1 expected. You entered \"%s\"", kbd.next());

            }
        }

        while (true){
            System.out.print("Enter the number of years: ");
            if (kbd.hasNextInt()){
                years = kbd.nextInt();
                if (years < 0){
                    System.out.printf("Please enter a positive number. You entered \"%d\"", years);

                }
                else{
                    break;
                }
            }
            else{
                System.out.printf("Error. Integer expected. You entered \"%s\"", kbd.next());

            }
        }


        while (true){
            System.out.print("Enter the number of times compounded: ");
            if (kbd.hasNextDouble()){
                comp = kbd.nextDouble();
                if (comp < 0){
                    System.out.printf("Please enter a positive number less than 1. You entered \"%.1f\"", comp);
                }
                else{
                    break;
                }
            }
            else{
                System.out.printf("Error. Number expected. You entered \"%s\"", kbd.next());

            }
        }

        System.out.printf("Your investment comes out to be %.2f", investment(deposit, interest, years, comp));
    }
}
