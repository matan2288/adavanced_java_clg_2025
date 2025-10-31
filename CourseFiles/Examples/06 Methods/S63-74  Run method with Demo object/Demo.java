import java.util.Scanner;
public class Demo 
{
  public static void main (String[] args) 
  {
    Demo demo = new Demo();
    demo.run();
}
      void run()
      {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the size of the square: ");
      int n = scan.nextInt();
      System.out.println( repeatString(n,"* ") );
      for (int i = 0; i < n - 2; i++) 
    {
      System.out.println( "* " + repeatString(n-2,"  ") + "*");
    }
    System.out.println( repeatString(n,"* ") );
  }
  String repeatString (int times, String value) 
  {
    String s = "";
    for (int i = 0; i < times; i++) 
    {
      s += value;
    }
    return s;
  }
}
