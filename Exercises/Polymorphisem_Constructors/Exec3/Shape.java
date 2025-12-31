// מה יהיה הפלט?

public class Shape {
    String draw(int n) {
        return "Shape " + n;
    }
}

// ____________________________________________
class Square extends Shape {
    @Override
    String draw(int n) {
        return "Square " + super.draw(n + 1);
    }
}

// _____________________________________________
class Circle extends Shape {
    @Override
    String draw(int n) {
        return "Circle " + super.draw(n - 1) + n; //! לא להתבלבל!!!!!! זה 12
    }
}

// ______________________________________________
class TestMain {
    public static void main(String[] args) {
        test(1);
        test(2);
        test(3);
    }

    static void test(int n) {
        Shape c = new Shape();
        if (n == 1) {
            c = new Square();
        }
        if (n == 2) {
            c = new Circle();
        }
        System.out.println(c.draw(n));
    }
}

//!      test(1); prints "Square Shape 2"
//!      test(2); prints "Circle Shape 12" //! לא להתבלבל!!!!!! זה 12
//!      test(3); prints "Shape 3"