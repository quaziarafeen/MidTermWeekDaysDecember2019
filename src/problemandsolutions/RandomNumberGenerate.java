package problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.
    public static void main(String[] args) {


        int[] number = new int[8];
        Random random = new Random(1);
        for (int i = 0; i < 8; i++) {
            number[i] = random.nextInt(100);


        }

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);


        }


    }
}