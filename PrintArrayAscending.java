import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayAscending {
   public static void createArray() {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the length of the array to be created:");
      int arrayLength = input.nextInt();
      int[] arr = new int[arrayLength];
      for (int i = 0; i < arrayLength; i++) {
         System.out.println("Enter the element to be inserted:");
         arr[i] = input.nextInt();
      }
      System.out.println("[LOG]: Array Created "+ Arrays.toString(arr));
      input.close();

      sortArray(arr);
   }
   
   public static void sortArray(int[] integerBasedArray) {
      int smallestElem = integerBasedArray[0];

      for (int index = 0; index < integerBasedArray.length; index++) {
         if (integerBasedArray[index] > smallestElem) smallestElem =  integerBasedArray[index];
         else continue;
         System.out.println("Array after "+ index+ "th iteration: "+ Arrays.toString(integerBasedArray));
      }
   }
   public static void main(String[] args) {
      createArray();
   }
}
