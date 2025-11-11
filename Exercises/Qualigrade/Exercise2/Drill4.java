package Exercises.Qualigrade.Exercise2;

public class Drill4 {
    public static void main(String[] args) {
        double[] numbers = {100, 95, 80};
        double value = 0.0;

        double accumolated = 0;

        for(int i = 0; i < numbers.length; i++) {
            accumolated += numbers[i];
        }

        value = accumolated / numbers.length;
        System.out.println("The average is " + value);
    }

}