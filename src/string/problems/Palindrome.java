package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String s = "MOM";
        String reverse = "";
        String d = "QUAZI";
        String back = "";
        char[] word = s.toLowerCase().toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
            for (int j = d.length() - 1; j >= 0; j--) {
                back = back + d.charAt(j);
            }

        }
        if (s.equals(reverse)) {
            System.out.println(s + "--word is a palindron");

        } else {
            System.out.println(s + "--word is not a palindron");
        }
        if (d.equals(back))
            System.out.println(d + "--word is a palindron");
        else
            System.out.println(d + "--word is not a palindron");



        isPalindrome("MADAM");
        isPalindrome("QUAZI");
        isPalindrome("REZOWAN");
        isPalindrome("MOM");
    }

        public static void isPalindrome(String name) {
        boolean status = true;
        char[] word = name.toLowerCase().toCharArray();

        int i1 = 0;
        int i2 = word.length - 1;


        while (i2 > i1) {

            if (word[i1] != word[i2]) {
                status = false;
            }
            ++i1;
            --i2;

        }

        System.out.println((name + " is a palindrome word : " + status));
    }

}