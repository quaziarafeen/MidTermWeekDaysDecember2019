package problemandsolutions;

import java.util.Scanner;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.
    public static void Grade() {
        int quiz_score, Mid_term_score,Final_score,avg;
        Scanner sc=new Scanner(System.in);
        System.out.print("Quiz score:");
        quiz_score=sc.nextInt();
        System.out.print("Mid-term score:");
        Mid_term_score=sc.nextInt();
        System.out.print("Final score:");
        Final_score=sc.nextInt();
        avg=(quiz_score + Mid_term_score + Final_score)/3;

        if(avg>=90) System.out.println("Your grade A.");
        else if((avg>=80) && (avg<90)) System.out.println("Your grade B.");
        else if((avg>=70) && (avg<80)) System.out.println("Your grade C.");
        else if((avg>=60) && (avg<70)) System.out.println("Your grade D.");
        else if((avg>=50) && (avg<60)) System.out.println("Your grade E.");
        else if(avg<50) System.out.println("Your grade F.");
        else System.out.println("Invalid");


    }


    public static void main(String[] args) {Grade();
    }



}
