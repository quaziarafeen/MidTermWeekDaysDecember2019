package string.problems;


import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
   String a = "SPACE";
   String f = "CAT";
   String g = "ACT";
   String b = "ESCAPE";
   char d[] = a.toCharArray();
   char h[] = f.toCharArray();
   char i[] = g.toCharArray();
   char e[]=  b.toCharArray();
        Arrays.sort(d);
        Arrays.sort(e);
        Arrays.sort(h);
        Arrays.sort(i);
    if (Arrays.equals(d,e))
        { System.out.println("This is Anagram");
        } else {
        System.out.println("This is not Anagram");
    }
        System.out.println();
    if (Arrays.equals(h,i)) {
        System.out.println("This is anagram");
    } else {
        System.out.println("This is not Anagram");
    }
    }
}
