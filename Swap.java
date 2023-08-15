public class Swap {
   public static void main(String[] args) {
      int x = 5;
      int y = 6;
      y = x ^ y;
      x = x ^ y;
      y = x ^ y;
      System.out.println(x);
      System.out.println(y);
   }
}
