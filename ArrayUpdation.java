import java.util.ArrayList;
import java.util.Scanner;

public class ArrayUpdation {
   static ArrayList<Integer> arr = new ArrayList<Integer>();
   static int length;

   public static void createArray() {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the length of the array:");
      length = input.nextInt();
      for (int i = 0; i < length; i++) {
         System.out.println("Enter element:");
         int val = input.nextInt();
         arr.add(val);
      }
      System.out.println("Array Created: "+ arr);
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
      arr.add(null);
      boolean isInserted = false;
      int i;
      for (i = arr.size() - 2; i >= 0; i--) {
         if (pos != i) {
            if (!isInserted) arr.set(i + 1, arr.get(i));
            else continue;
         }
         else {
            arr.set(i + 1, arr.get(i));
            arr.set(i, elem);
            isInserted = true;
         }
      }
      
      System.out.println("Resulting Array after Addition: "+ arr);
   }

   public static void deleteElem(int pos) {
      boolean isRemoved = false;
      for (int i = 0; i < arr.size(); i++) {
         if (pos != i) {
            if (!isRemoved) continue;
            else arr.set(i - 1, arr.get(i));
         }
         else {
            isRemoved = true;
            arr.set(1, arr.get(i+1));
         }
      }
      arr.remove(arr.size() - 1);
      System.out.println("Resulting Array after Deletion: "+ arr);
   }

   public static void main(String[] args) {
      createArray();
      insertElem(6, 2);
      deleteElem(1);
   }
}
