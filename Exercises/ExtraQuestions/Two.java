package Exercises.ExtraQuestions;

public class Two {

    String makeStringLonger(String str, int n) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < n; j++) {
                output = output.concat(String.valueOf(str.charAt(i)));
            }
        }

        System.out.println(output);

        return output;
    }

    public static void main(String[] args) {
        Two tst = new Two();
        tst.makeStringLonger("Hello", 3);
    }

}
