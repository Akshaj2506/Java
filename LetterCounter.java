import java.util.Scanner;

public class LetterCounter {
   public static void countLetters(String str) {
      int consonants = 0, vowels = 0, spaces = 0;
      for (int i = 0; i < str.length(); i++) {
         switch(str.substring(i, i+1).toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
               vowels++;
               break;
            case " ":
               spaces++;
               break;
            default:
               consonants++;
         }
         
      }
      System.out.println("Consonants: "+consonants+"\nVowels: "+vowels+"\nSpaces: "+spaces);
   }
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a string:");
      String str = input.nextLine();
      countLetters(str);
      input.close();
   }
}
