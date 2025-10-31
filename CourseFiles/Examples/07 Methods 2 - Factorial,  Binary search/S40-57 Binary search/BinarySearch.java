import java.util.Scanner;
public class BinarySearch
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int low = 0;
    System.out.print("Enter a number to search for: ");
    int val = scan.nextInt();  
    int[] arr = { 5,10,15,20,25,30,35,40,45,50 };
    System.out.println("Iterative search: " +
                       binaryS(val,arr,low,arr.length-1));
    System.out.println("Recursive search: " +
                       binaryR(val,arr,low,arr.length-1));
  }

  static int binaryS (int val, int arr[], int low, int high)
  {
    while (low <= high)
    {
      int mid = (low + high) / 2;
      if (val < arr[mid])
        high = mid - 1;
      else if (val > arr[mid])
        low = mid + 1;
      else
        return mid;  
    }
    return -1;  
  }

  static int binaryR (int val, int[] arr, int low, int high)
  {
    int mid = (low + high) / 2;
    if (val == arr[mid])
      return mid;
    else if (low > high)
      return -1;
    else if (val > arr[mid])
      return (binaryR(val,arr,mid+1,high));
    else                    // if val < arr[mid]
      return (binaryR(val,arr,low,mid-1));
  }
}
