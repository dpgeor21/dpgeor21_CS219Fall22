package ArrayExamples;

import java.util.Arrays;

public class SelectionSort {

    /*
    Return the index of the smallest item in the array
     */

    public static int smallest_loc(int start, int[] aoi) {
        int min_value = aoi[start];
        int location = start;

        for (int i = start + 1; i < aoi.length; i++) {
            if (aoi[i] < min_value) {
                min_value = aoi[i];
                location = i;
            }
        }
        return location;
    }

    public static int [] sort(int [] aoi){

        for (int i = 0; i < aoi.length - 1; i ++){
            int j = smallest_loc(i, aoi); // gets the location of the smallest value
            int temp = aoi[i]; // grabs the value at pos i
            aoi[i] = aoi[j];
            aoi[j] = temp;
        }
        return aoi;
    }

    public static boolean isOrdered(int [] aoi){
        /*
        Return true if aoi is in ascending order
         */
        for (int i = 0; i < aoi.length - 1; i++){
            if (aoi[i] > aoi[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(smallest_loc(0, new int [] {4, 1, 9, -1, 6}) == 3);
        System.out.println(smallest_loc(4, new int [] {4, 1, 9, -1, 6}) == 4);

        int [] aoi = {4, 1, 9, 2, -1, 6};

        System.out.println(Arrays.toString(sort(aoi)));
        System.out.println((isOrdered(aoi)));
        int [] aoi_sort = sort(aoi);
        System.out.println((isOrdered(aoi_sort)));
    }
}