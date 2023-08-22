import java.util.Scanner;

public class ConvertNumToText {
   public static void main(String[] args) {
      String[] text = new String[]{"zero", "one", "two", "three", "four","five", "six","seven", "eight", "nine"};
      Scanner in = new Scanner(System.in);
      String finalString = "";
      System.out.println("Enter a number:");
      String integ = in.nextLine();
      for (int i  = 0; i < integ.length(); i++) {
         finalString += text[Integer.parseInt(integ.substring(i, i+1))] + " ";
      }
      System.out.println(finalString);
      in.close();
   }
}
