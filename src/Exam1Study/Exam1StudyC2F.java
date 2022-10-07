package Exam1Study;

import java.util.Scanner;

public class Exam1StudyC2F {
    public static double C2F(double celsius){
        return (9 / 5.0) * (celsius) + 32;
    }

    public static void main(String [] args){



        double temperature;

        while (true){
            Scanner kbd = new Scanner(System.in);
            System.out.println("Enter the temperature in celsius: ");
            if (kbd.hasNextDouble()){
                temperature = kbd.nextDouble();
                break;
            }
                   }
        System.out.printf("The temperature conversion is %.1f\n", C2F(temperature));
    }
}
