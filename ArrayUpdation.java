import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdation {
   static int[] arr;
   static int length;

   public static void createArray() {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the length of the array:");
      length = input.nextInt();
      arr = new int[length];
      for (int i = 0; i < length; i++) {
         System.out.println("Enter element:");
         int val = input.nextInt();
         arr[i] = val;
      }
      System.out.println("Array Created: "+ Arrays.toString(arr));
   }

   public static void insertElem(int elem, int pos) {
      /* 
      arr = [1, 2, 3, 4]
      elem = 5; pos = 2
         if not:
            arr[i + 1] = val
         if yes:
            arr[i] = elem   
      */
      int[] newArr = new int[arr.length + 1];
      boolean isInserted = false;
      for (int i = arr.length - 1 ; i >= 0; i--) {
         if (pos != i) {
            if (!isInserted) newArr[i + 1] = arr[i];
            else newArr[i] = arr[i];
         }
         else {
            newArr[i + 1] = arr[i];
            newArr[i] = elem;
            isInserted = true;
         }
      }
      arr = newArr;
      System.out.println("Resulting Array after Addition: "+ Arrays.toString(arr));
   }

   public static void deleteElem(int pos) {
      boolean isRemoved = false;
      int[] newArr = new int[arr.length - 1];
      for (int i = 0; i < arr.length; i++) {
         if (pos != i) {
            if (!isRemoved) newArr[i] = arr[i];
            else newArr[i - 1] = arr[i];
         }
         else {
            isRemoved = true;
            newArr[i] = newArr[i + 1];
         }
      }
      System.out.println("Resulting Array after Deletion: "+ Arrays.toString(newArr));
   }

   public static void main(String[] args) {
      createArray();
      insertElem(6, 2);
      deleteElem(1);
   }
}
