import java.util.Arrays;
import java.util.Scanner;

public class Chaining {
   static String[] words;

   static void swap(int primaryIndex, int secondaryIndex) {
      String temp = words[primaryIndex + 1];
      words[primaryIndex + 1] = words[secondaryIndex];
      System.out.println(Arrays.toString(words));
      words[secondaryIndex] = temp;
      System.out.println(Arrays.toString(words));
   }

   public static void main(String[] args) {
      // Getting Input from the user for the words
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number of words to be chained: ");
      int numOfWords = input.nextInt();
      words = new String[numOfWords];
      for (int i = 0; i < numOfWords; i++) {
         System.out.println("Enter a word: ");
         String word = input.next();
         words[i] = word.toLowerCase().replaceAll(" ", "");
      }
      System.out.println("Initial Array: " + Arrays.toString(words));

      // Comparison
      for (int primaryIndex = 0; primaryIndex < numOfWords; primaryIndex++) {
         String primaryString = words[primaryIndex];
         int secondaryIndex = primaryIndex + 1;
         inner: while (secondaryIndex < numOfWords) {
            String secondaryString = words[secondaryIndex];
            String lastCharFirstWord = primaryString.substring(primaryString.length() - 1, primaryString.length());
            int lastCharSecondWordIndex = secondaryString.indexOf(lastCharFirstWord);
            // System.out.println(primaryString);
            // System.out.println(secondaryString + "\n");
            if (lastCharSecondWordIndex != -1) {
               String secondarySubstring = secondaryString.substring(0, lastCharSecondWordIndex + 1);
               String firstSubstring = primaryString.substring(primaryString.length() - secondarySubstring.length(),
                     primaryString.length());
               System.out.println(firstSubstring);
               System.out.println(secondarySubstring);
               if ((firstSubstring == secondarySubstring) && (firstSubstring.length() >= 3)) {
                  System.out.println("calling swap");
                  if (primaryIndex + 1 == secondaryIndex) {
                     secondaryIndex++;
                     continue inner;
                  }
                  swap(primaryIndex, secondaryIndex);
                  break inner;
               }
               secondaryIndex++;
            } else {
               System.out.println("Match not found");
               secondaryIndex++;
            }
         }
      }
      System.out.println("Final Array: " + Arrays.toString(words));
      input.close();
   }
}