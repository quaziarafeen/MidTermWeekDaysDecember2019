package math.problems;

public class Fibonacci {

    public void fibonacci( int x) {

        int a = 0;
        int b = 1;
        int c = a + b;

        System.out.println("Fibonacci numbers till 40 are: ");


        for (int i = 0; i <= 40; i++) {
            System.out.print(a + " ,");
            a = b;
            b = c;
            c = a + b;
        }
    }
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        Fibonacci fibonacci =new Fibonacci();
        fibonacci.fibonacci(40);

    }




    }

