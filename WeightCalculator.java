
// Created by Akshaj Srivastava (PRN: 1132230205)
class Weight {
   int kilo;
   int gram;

   public void getData(int kilo, int gram) {
      this.kilo = kilo;
      this.gram = gram;
   }

   public void putData() {
      System.out.println("Kilos: "+kilo);
      System.out.println("Grams: "+gram);
   }
   public Weight sumWeight(Weight weight1, Weight weight2) {
      int sumKilos = weight1.kilo + weight2.kilo;
      int sumGrams = weight1.gram + weight2.gram;
      int carry = sumGrams / 1000;
      sumGrams %= 1000;
      sumKilos+= carry;

      Weight resultWeight = new Weight();
      resultWeight.getData(sumKilos, sumGrams);

      return resultWeight;
   }
}

public class WeightCalculator {

   public static void main(String[] args) {
      Weight w1 = new Weight();
      Weight w2 =  new Weight();
      w1.getData(5, 300);
      w2.getData(4, 700);

      System.out.println("\nWeight 1 Data:");
      w1.putData();
      System.out.println("\nWeight 2 Data:");
      w2.putData();
      System.out.println("\n");
      
      Weight w3 = w1.sumWeight(w1, w2);
      w3.putData();
   }
}