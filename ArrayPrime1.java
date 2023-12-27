import java.util.Scanner;

public class ArrayPrime1 {
    
    static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] inputArray = new int[length];
        int[] primeResultArray = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            inputArray[i] = scanner.nextInt();
            if (checkPrime(inputArray[i])) {
                primeResultArray[i] = 1;
            } else {
                primeResultArray[i] = 0;
            }
        }

        System.out.println("Prime Check Result Array:");
        for (int i = 0; i < length; i++) {
            System.out.print(primeResultArray[i] + " ");
        }

        scanner.close();
    }
}

