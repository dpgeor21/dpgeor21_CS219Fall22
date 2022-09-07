package HW2;

import java.util.Scanner;

public class DayOfWeek {
    public static int dayofweek() {

        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter the month of the year (number): ");
        int m = kbd.nextInt();

        System.out.print("Enter the day of the month: ");
        int d = kbd.nextInt();

        System.out.print("Enter the year: ");
        int y = kbd.nextInt();

        int y2 = y - (14 - m) / 12;
        int x = y2 + y2 / 4 - y2 / 100 + y2 / 400;
        int m2 = m + 12 * ((14 - m) / 12) - 2;
        int d2 = (d + x + 31 * m2 / 12) % 7;

        return d2;


    }
    public static void main(String[] args) {

        System.out.print(dayofweek());


    }
}