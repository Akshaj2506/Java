import java.util.Scanner;
public class ForLoopDemo1{
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();

	        System.out.print("Enter the number of columns: ");
	        int columns = scanner.nextInt();

	        int[][] array = new int[rows][columns];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                array[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.println("Array:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }

	        // sum of rows and columns
	        int[] rowSum = new int[rows];
	        int[] columnSum = new int[columns];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                rowSum[i] += array[i][j];
	                columnSum[j] += array[i][j];
	            }
	        }

	        // Displaying the sum of rows
	        System.out.println("Row sums:");
	        for (int i = 0; i < rows; i++) {
	            System.out.println("Row " + (i + 1) + ": " + rowSum[i]);
	        }

	        // Displaying the sum of columns
	        System.out.println("Column sums:");
	        for (int j = 0; j < columns; j++) {
	            System.out.println("Column " + (j + 1) + ": " + columnSum[j]);
	        }

	        // minimum and maximum in rows and columns
	        System.out.println("Max and Min values from each row and column:");
	        for (int i = 0; i < rows; i++) {
	            int maxRowValue = array[i][0];
	            int minRowValue = array[i][0];

	            for (int j = 0; j < columns; j++) {
	                maxRowValue = Math.max(maxRowValue, array[i][j]);
	                minRowValue = Math.min(minRowValue, array[i][j]);
	            }

	            System.out.println("Row " + (i + 1) + ": Max = " + maxRowValue + ", Min = " + minRowValue);
	        }

	        for (int j = 0; j < columns; j++) {
	            int maxColumnValue = array[0][j];
	            int minColumnValue = array[0][j];

	            for (int i = 0; i < rows; i++) {
	                maxColumnValue = Math.max(maxColumnValue, array[i][j]);
	                minColumnValue = Math.min(minColumnValue, array[i][j]);
	            }

	            System.out.println("Column " + (j + 1) + ": Max = " + maxColumnValue + ", Min = " + minColumnValue);
	        }

	        scanner.close();
	    }
	}
