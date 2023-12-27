class Account {
   private String accountNumber;
   private String name;
   protected double balance;

   public Account(String accountNumber, String name, double balance) {
      this.accountNumber = accountNumber;
      this.name = name;
      this.balance = balance;
   }

   public void deposit(double amount) {
      balance += amount;
   }

   public void withdraw(double amount) {
      if (amount <= balance) {
         balance -= amount;
      } else {
         System.out.println("Insufficient funds!");
      }
   }

   public void displayBalance() {
      System.out.println("Account Number: " + accountNumber);
      System.out.println("Account Holder: " + name);
      System.out.println("Balance: Rs." + balance);
   }
}

class SavingsAccount extends Account {
   private double interestRate;

   public SavingsAccount(String accountNumber, String name, double balance, double interestRate) {
      super(accountNumber, name, balance);
      this.interestRate = interestRate;
   }

   public void accrueInterest() {
      balance += balance * interestRate;
   }
}

class CheckingAccount extends Account {
   private double overdraftLimit;
   public double overdraft;

   public CheckingAccount(String accountNumber, String name, double balance, double overdraftLimit) {
      super(accountNumber, name, balance);
      this.overdraftLimit = overdraftLimit;
   }

   @Override
   public void withdraw(double amount) {
      if (amount <= (balance + overdraftLimit)) {
         balance -= amount;
      } else {
         overdraft = overdraftLimit - balance;
         balance = 0;
      }
   }
}

public class Banking {
   public static void main(String[] args) {
      SavingsAccount savings = new SavingsAccount("SA123", "John Doe", 1000.0, 0.03);
      CheckingAccount checking = new CheckingAccount("CA456", "Jane Smith", 500.0, 200.0);

      savings.deposit(500.0);
      checking.deposit(300.0);

      savings.accrueInterest();
      checking.withdraw(700.0);

      savings.displayBalance();
      checking.displayBalance();
   }
}
