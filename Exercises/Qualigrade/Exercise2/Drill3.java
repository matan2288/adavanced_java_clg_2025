package Exercises.Qualigrade.Exercise2;

import java.util.Scanner;

public class Drill3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list;
        int count;

        count = 1;
        list = new int[] {0,1,1,2,3,3,3,4,4};
        
        for (int i = 1; i < list.length; i++) {
            if (list[i] != list[i-1]) {
                list[count] = list[i];
                count++;
            }
        }
        
        for (int i = 0; i < count; i++) {
            System.out.println(list[i]);
        }
        
        scan.close();
    }
}