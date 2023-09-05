import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrime {
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

      int[] resultArr = new int[arr.length];
      for (int j = 0; j < arr.length; j++) {
         if ((arr[j] != 2) && (arr[j] != 3) && (arr[j] != 5) && (arr[j] != 7)) {
            if (!((arr[j] % 2 == 0) || (arr[j] % 3 == 0) || (arr[j] % 5 == 0) || (arr[j] % 7 == 0))) resultArr[j] = 1;
            else if ((arr[j] % 2 == 0) || (arr[j] % 3 == 0) || (arr[j] % 5 == 0) || (arr[j] % 7 == 0)) resultArr[j] = 0;
         } else {
            resultArr[j] = 1;
         }
      }
      System.out.println("Result: "+ Arrays.toString(resultArr));
      in.close();
   }
}