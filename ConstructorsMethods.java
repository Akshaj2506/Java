public class ConstructorsMethods {
   public static void main(String[] args) {
      Laptop lappy = new Laptop();
      Computer comp = new Computer();
      lappy.introduce();
      comp.introduce();
   }
}
class Laptop {
   public Laptop() {
      System.out.println("I am a Lenovo Laptop");
   }

   public void introduce() {
      System.out.println("I can be carried anywhere");
   }
}
class Computer {
   public Computer() {
      System.out.println("I am an HP Desktop");
   }

   public void introduce() {
      System.out.println("I can't be moved from one place");
   }
}
