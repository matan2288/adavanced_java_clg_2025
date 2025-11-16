package Exercises.Qualigrade.Exercise2;

public class Drill10 {
    public int getRange(int[] values) {
        int min = values[values.length - 1];
        int max = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
            if (values[i] < min) {
                min = values[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
        return max - min;
    }

    void main() {
        int[] arr = { 6, 2, 3, 3, 1 };
        getRange(arr);
    }

}
