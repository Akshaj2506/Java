public class MaxSumMatrix {
   static int[][] matrix = new int[][]{
      {64, 15, 18, 54, 75},
      {81, 65, 149, 23, 45},
      {89, 34, 10, 1209, 37}
   };
   public static void main(String[] args) {
      // To find the sum of each row
      int[] matrixSums = new int[matrix.length];
      int maxSum = Integer.MIN_VALUE;
      for (int i = 0; i < matrix.length; i++) {
         int rowLength = matrix[i].length;
         int sum = 0;
         for (int j = 0; j< rowLength; j++) {
            sum += matrix[i][j];
         }
         matrixSums[i] = sum;
      }
      // To find the maximum out of all sums
      for (int index = 0; index < matrixSums.length; index++) {
         if (matrixSums[index] > maxSum) maxSum = matrixSums[index];
      }
      System.out.println(maxSum);
   }
}