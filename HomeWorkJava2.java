public class HomeWorkJava2 {
   public static void main(String[] args) {
       checkSumSign();}
    public static void checkSumSign() {
       int a = 5;
       int b = -6;
       int c = a + b;
       if (c >= 0) {
           System.out.println("Сумма положительная");
       }
       if (c < 0) {
           System.out.println("Сумма отрицательная");
       }
    }
}
