package string.problems;


public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        Permutation ("", "ABC");
    }
    public static void  Permutation( String string, String permutation){
        int x = permutation.length();
        if(x == 0){
            System.out.println(string);
        }
        else {
            for (int i=0; i<x; i++){
                Permutation(string + permutation.charAt(i), permutation.substring(0,i) + permutation.substring(i+ 1,x));
            }
        }
    }
}
