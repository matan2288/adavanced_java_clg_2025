package Exercises.Qualigrade.Exercise2;

// Fill in the body of the method below, which should return the position 
// of the first occurrence of the number num in the array numbers, or -1 if num does not appear in numbers.
//  (The positions in the array are numbered from 0 upwards, as usual in Java.)

public class Drill5 {
    public int findValue(int[] numbers, int num) {

        int matchingIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {

                matchingIndex = i;
                break;
            } else {
                matchingIndex = -1;
            }
        }
        System.out.println(matchingIndex);
        return matchingIndex;
    }

     void main()
    {
        int[] test = { 1, 2, 3, 4 };
        findValue(test, 3);
    }

}
