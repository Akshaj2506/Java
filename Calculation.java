import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
      int[] nums = new int[2];
        if (args.length != 2) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the two numbers");
            for (int i =0; i< 2; i++) {
               nums[i] = scan.nextInt();
            }
            scan.close();
            return;
        }

        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double result = divide(a, b);
			
            System.out.println("Result of " + a + " / " + b + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number Please provide valid numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Program executed");
        }
    }

    private static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
