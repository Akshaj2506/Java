import java.util.Scanner;

public class SimpleInterest {
   public static double calcInterest(double principal, double timePeriod) {
      int interestRate = 0;
      if ((principal <= 10000) && (timePeriod <= 2)) interestRate = 9;
      if ((principal <= 10000) && (timePeriod >= 2)) interestRate = 10;
      if ((principal > 10000) && (timePeriod >= 2)) interestRate = 11;

      return (interestRate * principal * timePeriod) / 100;
   }
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the principal amount: ");
      double principalAmt = input.nextDouble();
      System.out.println("Enter the time period: ");
      double timePeriod = input.nextDouble();

      System.out.println("The calculated simple interest is: "+ calcInterest(principalAmt, timePeriod));
      input.close();
   }
}
