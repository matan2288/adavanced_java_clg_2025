class X {
    private int n1 = 100; // Z.X n1 = 5
    private int n2 = 200; // Z.X n2 = 2

    public X(int n1, int n2) {
        this.n1 = n2;
        this.n2 = n1;
    }
}

class Y extends X {
    private int z = 300;
    private int a = 5;
    private int b = 10;

    public Y(int n1, int n2) {
        super(n2, n1);
        z = n1;
    }
}

class Z extends Y {
    private int a = 2;
    private int b = 4;
    private int z = 11;

    public Z(int a, int b, int n1, int n2) { // 8 10 5 10
        super(a, b);
        a = n1;
        this.b = n2;
    }

    public Z(int a, int b) {
        this(a, 10, 5, b);
    }

}

class Main {
    public static void main(String[] args) {
        Z a = new Z(5, 2, 3, 9);
        Z b = new Z(8, 10);
    }
}
/*
 * What will be the value of the private variables a, b, n1, n2 and z as a
 * result of:
 * 
 * Z a = new Z(5,2,3,9);
 * Z b = new Z(8,10);
 */
