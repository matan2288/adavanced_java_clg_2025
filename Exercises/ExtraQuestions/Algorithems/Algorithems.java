package Exercises.ExtraQuestions.Algorithems;

public class Algorithems {
    // ? Question 1, Is array sorted?
    public boolean isSorted(int[] t) {
        if (t.length <= 1) {
            return false;
        }
        boolean isSortedUp = true;
        boolean isSortedDown = true;

        for (int i = 1; i < t.length; i++) {
            if (t[i] >= t[i - 1]) {
                isSortedDown = false;
            } else if (t[i] <= t[i - 1]) {
                isSortedUp = false;
            }
        }

        return isSortedDown || isSortedUp;

    }

    // ? Question 2, Reverse num
    public int reverseNum(int n) {
        String numAsString = String.valueOf(n);
        String output = "";

        for (int i = numAsString.length() - 1; i >= 0; i--) {
            output = output + numAsString.charAt(i);
        }

        return Integer.valueOf(output);
    }

    public int[] reverseArr(int[] t) {
        int[] output = new int[t.length];

        for (int i = t.length - 1; i >= 0; i--) {
            output[(t.length - i) - 1] = t[i];
        }

        return output;
    }

    public int checkForBiggest(int[] a) {
        int biggest = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    biggest = a[j];
                }
            }
        }

        return biggest;
    }

    public int numOfRepitition(int[] a, int n) {
        int output = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                output++;
            }
        }

        return output;
    }

    public int bigeestMinusSmallest(int[] a) {
        int biggest = 0;
        int smallest = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    biggest = a[j];
                } else if (a[j] < a[i]) {
                    smallest = a[j];
                }
            }
        }

        return biggest - smallest;
    }

    public void main(String[] args) {
        // // ? Question 1
        // int[] a = { 1, 2, 3 };
        // boolean question1 = isSorted(a);
        // System.out.println(question1);

        // // ? Question 2
        // int n = 571;
        // int question2 = reverseNum(n);
        // System.out.println(question2);

        // // Print reverseArr value
        // int[] arrToReverse = { 1, 2, 3, 4, 5 };
        // int[] reversedArr = reverseArr(arrToReverse);

        // // Print the entire array as a string without a loop
        // System.out.println(java.util.Arrays.toString(reversedArr));

        // // Print the entire array as a string without a loop
        // System.out.println(checkForBiggest(arrToReverse));

        int[] a = { 1, 2, 3, 5, 1, 1, 1 };
        System.out.println(bigeestMinusSmallest(a));
    }
}
