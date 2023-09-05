import java.util.Arrays;
import java.util.Scanner;

public class ArrayEvenOdd {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of elements you want to have in your array:");
      int numElem = in.nextInt();
      int[] arr = new int[numElem];
      for (int i = 0; i < numElem; i++) {
         System.out.println("Enter a number: ");
         int enteredInt = in.nextInt();
         arr[i] = enteredInt;
      }
      System.out.println("Created Array: "+ Arrays.toString(arr));

      int[] arrEven = new int[arr.length];
      int[] arrOdd = new int[arr.length];
      int evenPointer = 0;
      int oddPointer = 0;

      int j = 0;
      while(j < arr.length) {
         if (arr[j] % 2 == 0) {
            arrEven[evenPointer] = arr[j];
            evenPointer++;
         }
         else {
            arrOdd[oddPointer] = arr[j];
            oddPointer++;
         }
         j++;
      }
      System.out.println("Even Array: "+ Arrays.toString(arrEven).replaceAll(", 0", ""));
      System.out.println("Odd Array: "+ Arrays.toString(arrOdd).replaceAll(", 0", ""));
      in.close();
   }
}
