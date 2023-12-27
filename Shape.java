public class Shape {
   public double getArea() {
      System.out.println("Shape not defined");
      return 0;
   }
}
class Rectangle extends Shape {
   double length;
   double breadth;

   public Rectangle(double len, double breadth) {
      this.length = len;
      this.breadth = breadth;
   }

   public double getArea() {
      System.out.println("The area of the rectangle is: "+ length*breadth);
      return length * breadth;
   }
}
class Main {
   public static void main(String[] args) {
      Shape undefShape = new Shape();
      Rectangle rect = new Rectangle(15, 10);
      undefShape.getArea();
      rect.getArea();
   }
}
