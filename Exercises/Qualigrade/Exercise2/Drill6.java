package Exercises.Qualigrade.Exercise2;

public class Drill6 {
    public static boolean isReversible(String chars) {
        String input = chars;
        String reversedInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedInput += input.charAt(i);
        }
        boolean p = reversedInput.equals(input);
        System.out.println(p);
        return p;
    }

    void main() {
        isReversible("madam");
    }
}
