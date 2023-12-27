import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int userInput = scanner.nextInt();
        if (isArmstrongNumber(userInput)) {
            System.out.println(userInput + " is an Armstrong number.");
        } else {
            System.out.println(userInput + " is not an Armstrong number.");
        }
        scanner.close();
    }
}
