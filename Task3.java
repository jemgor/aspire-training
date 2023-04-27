package aspire.internship;

import java.util.Arrays;
import java.util.Scanner;

//enter the array elements then choose the method you would like to use on the array
public class Task3 {
    public static void main(String[] args) {
        //int[] array = {1,4,-5,37,-26,15,-41,81,-8,48,56,42};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: \n");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter array elements:\n");
        for (int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        //sort array
        System.out.println("Original array: " + Arrays.toString(array) + "\nSorted array:" + SortArray(array));

        //find array average
        System.out.println("Average = " + Average(array));

        //maximum
        System.out.println("maximum(array) = " + maximum(array));

        //minimum
        System.out.println("minimum(array) = " + minimum(array));
    }

    public static String SortArray(int[] a){
        //use another array
        int[] array2 = new int[a.length];
        for (int i =0; i<a.length; i++){
            array2[i] = a[i];
        }
        Arrays.sort(array2);

        return Arrays.toString(array2);
    }

    public static double Average(int[] a){
        int sum = 0;
        float avg;
        for (int j : a) {
            sum += j;
        }
        avg = (float) sum / a.length;
        return avg;
    }

    public static int minimum(int[] a){
        int min = a[0];
        for (int j : a) {
            if (j < min)
                min = j;
        }
        return min;
    }

    public static int maximum(int[] a){
        int max = a[0];
        for (int i : a) {
            if (i > max)
                max = i;
        }
        return max;
    }

}
