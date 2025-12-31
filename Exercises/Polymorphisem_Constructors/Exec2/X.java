//? בהינתן שלושת המחלקות הבאות, מה יהיה הפלט?

public class X {
  public X () {
    System.out.println("X constructor");  //! 1 First print
  }
  public void f(int a) {
    System.out.println("X.f(" + a + ")"); //! 3 Third print
  }
}
// _____________________________________________________

class Y extends X {
int a; // 5
  public Y (int b) {
    System.out.println("Y constructor");  //! 2 Second print
    a = b;
  }
  @Override
  public void f(int c) {
    super.f(c);
    System.out.println("X.f(" + a + ")"); //! 4 Fourth print a = b from line 17, a=5 
  }
}

// ________________________________________

class Demo 
{
  public static void main (String[] args)
  {
      X x = new Y(5);
      x.f(3);
  }
}


 
