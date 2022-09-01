package HW1;

import java.text.DecimalFormat;

public class Time {
    public static void main(String [] args){
        int hour = 20;
        int minute = 35;
        int second = 24;

        int hour_to_second = hour * 3600;
        int minute_to_second = minute * 60;

        int seconds_since = hour_to_second + minute_to_second + second;
        double seconds_remaining = 24 * 3600 - hour_to_second - minute_to_second - second;
        double percent = ((24 * 3600 - seconds_remaining) / (24 * 3600)) * 100;

        int current_hour = 20;
        int current_minute = 48;
        int current_second = 42;

        double diff_hour = current_hour - hour;
        int diff_minute = current_minute - minute;
        int diff_second = current_second - second;

        System.out.print("It has been "); System.out.print(seconds_since); System.out.println(" seconds since midnight.");
        System.out.print("The percentage of day that has passed is "); System.out.println(percent);
        System.out.print(diff_hour); System.out.print(" hours, "); System.out.print(diff_minute); System.out.print(" minutes, and ");
        System.out.print(diff_second); System.out.println(" seconds have passed.");
    }
}
