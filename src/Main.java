import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sugarcoder on 9/13/2015.
 */

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        /* Challenge:
           program using arrays that sort a list of integers in descending order.
           numbers in the array: 106, 26, 81, 5, 15
           Implement methods:
             - getIntegers = return an array of entered integers from the keyboard
             - printArray = points out the contents of the array
             - setIntegers = sort the array and return a new array containing the sorted numbers
        */

        int[] myIntegers = getIntegers(5);

        int[] sorted = sortIntegers(myIntegers);

        printArray(sorted);

    }


    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }



    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }



    public static int[] sortIntegers(int[] array) {
        /*
        int[] sortedArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        */

        // this line of code replaces the top chunk commented out
        int[] sortedArray = Arrays.copyOf(array, array.length);


        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            // element 0   50
            // element 1   160
            // element 2    40

            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;

    }

}
