import java.util.Scanner;
public class CharacterDemo {
  public static void main (String[] args) {
    int n = 1;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the characters to process: ");
    String line = scan.nextLine();
    for (int i = 0; i < line.length(); i++) {
      char c = line.charAt(i);
      System.out.println("c = " + c + " (character number " + (int)c + ")");
      System.out.println("Character.isLetter(c) = " + Character.isLetter(c));
      System.out.println("Character.isDigit(c) = " + Character.isDigit(c));
      System.out.println("Character.isUpperCase(c) = " + Character.isUpperCase(c));
      System.out.println("Character.isLowerCase(c) = " + Character.isLowerCase(c));
      System.out.println("Character.toUpperCase(c) = " + Character.toUpperCase(c));
      System.out.println("Character.toLowerCase(c) = " + Character.toLowerCase(c));
    }
  }
}
