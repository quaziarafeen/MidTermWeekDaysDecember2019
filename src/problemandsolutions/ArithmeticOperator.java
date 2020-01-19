package problemandsolutions;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.
   static int a;
   static int b;
    public static void adding() {
        a = 20;
        b = 50;
       int add = a + b ;
        System.out.println("The result of adding two value is  " + add);
    }
    public static void substraction() {
        a = 20;
        b = 50;
        int substract = a - b ;
        System.out.println("The result of substract two value is  " + substract);
    }
    public static void muliplying() {
        a = 20;
        b = 50;
        int multiply = a * b ;
        System.out.println("The result of multiply two value is  "  + multiply);
    }
    public static void divided() {
        a = 20;
        b = 50;
        int divide = a / b ;
        System.out.println("The result of divison two value is  " + divide);
    }

    public static void main(String[] args) {
        adding();
        substraction();
        muliplying();
        divided();
    }



}
