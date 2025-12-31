package Exercises.ExtraQuestions;

public class Four {

    String buildStr(String str, int n) {
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            if ((i + 1) % n == 0) {
                output = output.concat(String.valueOf(str.charAt(i)));
            }
        }

        System.out.println(output);

        return output;
    }

    public static void main(String[] args) {
        Four tst = new Four();
        tst.buildStr("hello", 2);
    }
}
