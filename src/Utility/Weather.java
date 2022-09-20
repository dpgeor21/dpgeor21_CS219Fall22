package Utility;

import java.util.Scanner;

public class Weather {
    public static double windchill(double temp //temp far
            , double velo){ // velocity in mph
        return 35.75 + 0.6215*temp + (0.4275*temp - 35.75)*(Math.pow(velo, 0.16));
    }

    public static void main(String [] args){

        // used for getting input
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter temp in degrees F: ");

        double temperature;

        if (kbd.hasNextDouble()) {
           temperature = kbd.nextDouble();
        }
        else{
            System.out.printf("Error: please enter a decimal number. You entered \"%s\"", kbd.next());
            return; //exit main
        }


        double wind = 0; // need to give wind a value so intelij will run


        while (true) {
            System.out.print("Enter wind velocity in MPH: ");

            if (kbd.hasNextDouble()) {
                wind = kbd.nextDouble();
                if (wind < 0) {
                    System.out.printf("Error: Velocity cannot be negative you entered \"%.1f\"", wind);
                }
                else {
                    break;
                }
            } else {
                System.out.printf("Error: Please enter a decimal number. You entered \"%s\"", kbd.next());
            }
        } // While loop
        System.out.printf("The windchill for %.1f degrees F with a wind speed of %.1f MPH is %.1f\n",
                temperature, wind, windchill(temperature, wind));

        System.out.println("They said \"Don't do it\"");
    }

}