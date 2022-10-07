package Exam1Study;

import java.util.Scanner;

public class Cone {
    public static double volume(double r, double h){
        return (1 / 3.0) * Math.PI * Math.pow(r, 2) * h;
    }
    public static void main(String [] args){

        double radius;
        double height;
        while (true){
            Scanner kbd = new Scanner(System.in);
            System.out.print("Enter the radius: ");
            if(kbd.hasNextDouble()){
                radius = kbd.nextDouble();
                if (radius < 0){
                    System.out.print("Please enter a positive number:");
                }
                else{
                    break;
                }
            }
            else{
                System.out.print("Please enter a number: ");
            }
        }
        while (true){
            Scanner kbd = new Scanner(System.in);
            System.out.print("Enter the height: ");
            if(kbd.hasNextDouble()){
                height = kbd.nextDouble();
                if (height < 0){
                    System.out.print("Please enter a positive number:");
                }
                else{
                    break;
                }
            }
            else{
                System.out.print("Please enter a number: ");
            }
        }
        System.out.printf("The volume of the cone with radius %.1f\n and height" +
                " %.1f\n is %.1f\n", radius, height, volume(radius, height));
    }
}
/*
public static double getValidDouble(Scanner s, String prompt) {
while (true) {
System.out.print(prompt);
if (s.hasNextDouble()) {
double d = s.nextDouble();
if (d < 0)
System.out.printf("Error: number should be positive. You entered %f\n",d);
else
return d;
}
else {
String tok = s.next();
System.out.printf("Error: expected a number. You entered %s\n",tok);
}
}
}
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
double r = getValidDouble(s, "Radius:");
double h = getValidDouble(s, "Height: ");
System.out.printf("The volume of your cone is %.2f", volume(r, h));
}
}
 */
