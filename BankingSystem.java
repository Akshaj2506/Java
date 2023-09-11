import java.util.Scanner;

public class BankingSystem {
   public static void main(String[] args) {
      Bank bankCustomer = new Bank();
      boolean isRunning = true;
      Scanner in = new Scanner(System.in);
      while (isRunning) {
         System.out.println("Enter 1 for showing balance; 2 for depositing; 3 for withdrawing; 4 for exiting");
         int decision = in.nextInt();
         switch(decision) {
            case 1:
               bankCustomer.showBalance();
               break;
            case 2:
               System.out.println("Enter the amount you want to deposit: ");
               double amount = in.nextDouble();
               bankCustomer.deposit(amount);
               break;
            case 3:
               System.out.println("Enter the amount you want to withdraw: ");
               double withdrawAmt = in.nextDouble();
               bankCustomer.withdraw(withdrawAmt);
               break;
            case 4:
               isRunning = false;
               System.out.println("Alright, thank you!");
               break;
         }
      }
      in.close();
   }

}

class Bank {
   double bankBalance;

   Bank() {
      //Min balance of 500
      bankBalance = 500;
   }

   public void showBalance() {
      System.out.println("Your account balance is Rs." + bankBalance);
   }

   public void deposit(double amount) {
      bankBalance += amount;
      System.out.println("Deposited: " + amount);
      System.out.println("Updated Balance: " + bankBalance + "\n");
   }

   public void withdraw(double amount) {
      if ((bankBalance >= amount) && (amount != 0) && ((bankBalance - amount) >= 500)) {
         bankBalance -= amount;
         System.out.println("Withdrawn: " + amount);
         System.out.println("Updated Balance: " + bankBalance + "\n");
      } else {
         System.out.println("You are not allowed to withdraw :(");
      }
   }
}