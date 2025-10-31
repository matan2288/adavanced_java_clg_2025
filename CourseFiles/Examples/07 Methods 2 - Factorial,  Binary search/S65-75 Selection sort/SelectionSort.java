import java.util.Scanner; 
public class SelectionSort 
{
  final static int SIZE = 4;
   
  public static void main (String[] args)  
  {
    int[] arr = new int[SIZE];
    getArray(arr);	      // Read  values and assign them to the array
    System.out.print("Before sorting: ");
    displayArray(arr);	  // Display the values of the array
    sortArray (arr);	    // Sort the array using a selection sort
    System.out.print("After sorting: ");
    displayArray(arr);	  // Display the values of the array
  }
  
  static void getArray (int[] numbers) 
  {
	  Scanner scan = new Scanner(System.in) ;
    System.out.println("Enter "+ numbers.length +" integers to be sorted:");
    for (int i = 0; i < numbers.length; i++) 
    {
      System.out.print("Enter integer " + (i+1) + ": " );
      numbers[i] = scan.nextInt() ;
    }
  }

  static void displayArray (int[] numbers) 
  {
    System.out.println("The array elements are:");
    for (int n : numbers) 
    {
      System.out.print("\t" + n);
    }
    System.out.println();
  }

  static void sortArray (int[] numbers) 
  {
    for (int i = 0; i < numbers.length; i++) 
    {
      int minIndex = indexMin(numbers, i, numbers.length-1);
      swap(numbers, i, minIndex);
    }
  }

  static int indexMin (int[] numbers, int low, int high) 
  {
    int minIndex = low;
    for (int i = low; i <= high; i++) 
    {
      if (numbers[i] < numbers[minIndex]) 
      {
        minIndex = i;
      }
    }
    return minIndex;
  }

  static void swap (int[] numbers, int loc1, int loc2) 
  {
    int temp = numbers[loc1];
    numbers[loc1] = numbers[loc2];
    numbers[loc2] = temp;
  }
}

 