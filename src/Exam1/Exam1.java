package Exam1;

import java.util.Scanner;

public class Exam1 {

    public static int numberOfDigits(int n){
        int cnt = 0;
        int m = 0;
        while(n > 0){
            m = n % 10;
            if (m > 2 && m < 7){
                cnt ++;
            }
            n = n / 10;
        }
        return cnt;
    }

    public static int validateInput(){
        int n;
        Scanner kbd = new Scanner(System.in);
        while (true) {

            System.out.print("Enter an integer: ");
            if(kbd.hasNextInt()){
                n = kbd.nextInt();
                if (n < 0){
                    System.out.printf("Be sure to enter a positive number");
                }
                else{
                    break;
                }
            }
            else if(kbd.hasNextDouble()){

                System.out.printf("Be sure to enter an integer, you entered %f\n ", kbd.nextDouble());
            }
            else{
                System.out.printf("Be sure to enter an integer, you entered %s\n ", kbd.next());
            }

        }
        return n;
    }


    public static void main(String [] args) {
        int n = validateInput();

        System.out.print(numberOfDigits(n));
    }
}
