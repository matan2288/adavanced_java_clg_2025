import java.util.Scanner;
public class CountLetters {
  public static void main (String[] args) {
    int[] count = new int[26];
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a line of text: ");
    String line = scan.nextLine();
    // process the line
    //for (char c: line){
     for (int i = 0; i < line.length(); i++) {
       char c = line.charAt(i);
      if (Character.isLetter(c)) {
        count[ Character.toUpperCase(c) - 'A' ]++;
      }
    }
    // output the results
    for (int i = 0; i < count.length; i++) {
      char c = (char)('A' + i);
      System.out.println(c + " occurs " + count[i] + " times");
    }
  }
}
