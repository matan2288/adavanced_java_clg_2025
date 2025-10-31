import java.io.File;

public class ArgsDemo {
  public static void main(String[] args) 
  {
       
    System.out.println("There are " + args.length + " arguments to main");
    for (int i=0;i<args.length;i++)
    {
    
      File f = new File(args[i]);
      System.out.println("Filename \"" + args[i] + "\" exists: " + f.exists());
    }
  }
}