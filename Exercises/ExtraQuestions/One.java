package Exercises.ExtraQuestions;

public class One {

    String replacePlaces(String str, int n1, int n2) {
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == n1) {
                output = output.concat(String.valueOf(str.charAt(n2)));
            } else if (i == n2) {
                output = output.concat(String.valueOf(str.charAt(n1)));
            } else {
                output = output.concat(String.valueOf(str.charAt(i)));
            }
        }

        System.out.println(output);
        return output;
    }

    public static void main(String[] args) {
        One tst = new One();
        tst.replacePlaces("hello", 1, 2);
    }
}
