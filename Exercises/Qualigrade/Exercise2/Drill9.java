package Exercises.Qualigrade.Exercise2;

public class Drill9 {

    public boolean isSorted(int[] array) {
        boolean isSorted = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                isSorted = false;
            }

        }
        System.out.println(isSorted);
        return isSorted;
    }

    void main() {
        int[] arr = { 1, 2, 3, 3, 3 };
        isSorted(arr);
    }

}
