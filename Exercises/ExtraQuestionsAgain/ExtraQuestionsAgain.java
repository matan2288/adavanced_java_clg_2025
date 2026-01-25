package Exercises.ExtraQuestionsAgain;

public class ExtraQuestionsAgain {

    // ? Question 1
    public static String replacePlaces(String s, int n1, int n2) {
        char s1 = s.charAt(n1);
        char s2 = s.charAt(n2);
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == n1) {
                output = output + s2;
            } else if (i == n2) {
                output = output + s1;
            } else {
                output = output + s.charAt(i);
            }
        }
        return output;
    }

    // ? Question 2
    public static String addChars(String s, int n) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < n; j++) {
                output = output + s.charAt(i);
            }
        }
        return output;
    }

    // ? Question 3
    public static String buildStr(String s, int n) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % n == 0) {
                output = output + String.valueOf(s.charAt(i)).toUpperCase();
            } else {
                output = output + s.charAt(i);
            }
        }
        return output;
    }

    // ? Question 5
    public static int sumN(int[] arr, int n) {
        int output = 0;
        for (int i = n; i < arr.length; i++) {
            if (i % n == 0) {
                output = output + arr[i];
                System.out.println(arr[i]);
            }
        }
        return output;
    }

    void main(String[] args) {
        String str = "hello";

        // ? Question 1
        String question1 = replacePlaces(str, 1, 2);
        System.out.println(question1);

        // ? Question 2
        String question2 = addChars(str, 3);
        System.out.println(question2);

        // ? Question 3
        String question3 = buildStr(str, 2);
        System.out.println(question3);

        // ? Question 5
        int[] a = { 1, 2, 4, 7, 8, 2, 5, 50 };
        int question5 = sumN(a, 2);
        System.out.println(question5);

    }

}
