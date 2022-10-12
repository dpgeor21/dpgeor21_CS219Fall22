package ArrayExamples;

import java.util.Arrays;
import java.util.Random;

public class Examples {
    // an array is pretty much just a list


    public static void f(int x){
        x = 7;
    }


    // function to fill an array with random
    // integers between 1 and 10 inclusive
    public static void fill_random(int [] arr){
        Random rng = new Random();
        rng.setSeed(10);

        for (int i = 0; i < arr.length; i++){
            arr[i] = rng.nextInt(1, 11);

        }
    }

    public static void print_array(int [] arr){
        System.out.print('[');
        for (int i = 0; i<arr.length - 1; i++)
            System.out.print(arr[i] + ", ");
        System.out.print(arr[arr.length - 1]);
        System.out.println(']');
    }

    public static void print_array_v2(int [] arr){
        System.out.print('[');

        // enhanced for loop
        for (int v : arr) { // for the values in the array, not the index
            System.out.print(v + ", ");
        }
        System.out.println(']');
    }

    public static int sum(int [] arr){
        int total = 0;
        for (int v : arr){
            total += v;
        }
        return total ;
    }

    public static int sum_v2(int [] arr){
        int total = 0;
        for(int i = 0; i < arr.length; i ++){
            total += arr[i];
        }
        return total;
    }

    public static int sum_v3(int[] array){
        int i = 0;
        int total = 0;
        while (i < array.length){
            total += array[i++]; // very common way to do i++ at the same time as array[i]
        }
        return total;
    }
    // write a function that returns the average

    public static double average(int[] array){
        return (double)sum_v3(array) / array.length;
    }

    public static double median(int [] arr){
        // first sort greatest to least
        Arrays.sort(arr);
        // then find the middle number
        if(arr.length % 2 != 0){
            // number is odd
            return arr[arr.length / 2];
        }
        else{
            return (arr[arr.length / 2] + arr[arr.length/2 -1]) / 2.0;
        }

    }

    public static void main(String [] args){

        int [] nums = {4, 1, 0, 9, 2, 8}; // how to declare an array
        int [] grades = new int[10]; // allocating space for 10 grades (if you didn't know what the numbers are)

        System.out.println(nums[2]); // how to call a specific number in an array
        // System.out.println(nums[-1]); // index out of range error


        int z = 33;
        f(z);
        System.out.println(z); // when z is assigned to x, a copy is made

        fill_random(grades);
        print_array(grades);
        print_array_v2(grades);
        System.out.println(sum(grades) == 48);
        System.out.println(sum_v2(grades) == 48);
        System.out.println(sum_v3(grades) == 48);
        System.out.println(average(grades) == 4.8);
        System.out.println(median(grades) == 4.5);

    }

}
