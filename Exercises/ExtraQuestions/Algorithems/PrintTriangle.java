package Exercises.ExtraQuestions.Algorithems;
// The code below should print a triangle which is n lines high. When n = 5 this is what should be printed: 

import java.util.Scanner;

// הקוד הבא מדפיס משולש שגובהו n שורות. כאשר n=5 יתקבל:

//              *
//              **
//              ***
//              ****
//              *****
public class PrintTriangle {

    public String printT(int n) {
        String star = "*";
        String output = "";

        for (int i = 0; i < n; i++) {
            output = output + star;
            System.out.println(output);
        }

        return output;
    }

    public void test(int t) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of triangle: ");
        int a = scan.nextInt();
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void main() {
        printT(5);
        test(5);
    }

}
