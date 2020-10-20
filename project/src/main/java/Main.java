public class Main {
   public static void main(String[] args) {
      int num1 = 16;
      int num2 = 3;

      System.out.printf("%d + %d = %d%n", num1, num2, TravisMath.add(num1, num2));
      System.out.printf("%d - %d = %d%n", num1, num2, TravisMath.subtract(num1, num2));
      System.out.printf("%d * %d = %d%n", num1, num2, TravisMath.multiply(num1, num2));
      System.out.printf("%d / %d = %d%n", num1, num2, TravisMath.divide(num1, num2));
   }
}
