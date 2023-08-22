public class Matrix {
   //Created by Akshaj Srivastava [PRN 1132230205]
   static int[][] matrix = new int[][] {
         { 64, 15, 18, 54, 75 },
         { 81, 65, 149, 23, 45 },
         { 89, 34, 10, 1209, 37 }
   };

   public static void rowSum() {
      // To find the sum of each row
      for (int i = 0; i < matrix.length; i++) {
         int rowLength = matrix[i].length;
         int sum = 0;
         for (int j = 0; j < rowLength; j++) {
            sum += matrix[i][j];
         }
         System.out.println("The sum of Row " + (i + 1) + " is " + sum);
      }
   }

   public static void colSum() {
      // To find the sum of each column of the matrix
      int row = matrix.length;
      int col = matrix[0].length;
      for (int i = 0; i < col; i++) {
         int sum = 0;
         for (int j = 0; j < row; j++) {
            sum += matrix[j][i];
         }
         System.out.println("The sum of Column " + (i + 1) + " is " + sum);
      }
   }

   public static void rowMax() {
      for (int i = 0; i < matrix.length; i++) {
         int rowLength = matrix[i].length;
         int maxVal = matrix[i][0];
         for (int j = 0; j < rowLength; j++) {
            if (matrix[i][j] > maxVal) {
               maxVal = matrix[i][j];
            }
         }
         System.out.println("The max of Row " + (i + 1) + " is " + maxVal);
      }
   }

   public static void rowMin() {
      for (int i = 0; i < matrix.length; i++) {
         int rowLength = matrix[i].length;
         int minVal = matrix[i][0];
         for (int j = 0; j < rowLength; j++) {
            if (matrix[i][j] < minVal) {
               minVal = matrix[i][j];
            }
         }
         System.out.println("The min of Row " + (i + 1) + " is " + minVal);
      }
   }

   public static void colMax() {
      int row = matrix.length;
      int col = matrix[0].length;
      for (int i = 0; i < col; i++) {
         int maxVal = Integer.MIN_VALUE;
         for (int j = 0; j < row; j++) {
            if (maxVal < matrix[j][i]) maxVal = matrix[j][i];
         }
         System.out.println("The max of Column " + (i + 1) + " is " + maxVal);
      }
   }
   public static void colMin() {
      int row = matrix.length;
      int col = matrix[0].length;
      for (int i = 0; i < col; i++) {
         int minVal = Integer.MAX_VALUE;
         for (int j = 0; j < row; j++) {
            if (minVal > matrix[j][i]) minVal = matrix[j][i];
         }
         System.out.println("The min of Column " + (i + 1) + " is " + minVal);
      }
   }

   public static void main(String[] args) {
      rowSum();
      colSum();
      rowMax();
      rowMin();
      colMax();
      colMin();
   }
}