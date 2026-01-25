package Exercises.ExtraQuestions;

public class Five {

    int buildIt(int[] intArr, int n) {
        int output = 0;

        for (int i = 0; i < intArr.length; i++) {
            if (i % n == 0 ) {
                output += intArr[i];
            }
        }

        System.out.println(output);

        return output;
    }

    public static void main(String[] args) {
        Five tst = new Five();
        tst.buildIt(new int[] {1,2,4,7,8,2,5,50}, 3);
    }
}
