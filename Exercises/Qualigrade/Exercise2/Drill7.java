package Exercises.Qualigrade.Exercise2;

import java.util.Arrays;

public class Drill7 {
    public static void invertArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        invertArray(arr);
    }
}
