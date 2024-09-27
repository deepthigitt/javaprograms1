package Examplefolder3;

import java.util.Scanner;

public class lab016 {
    //grade calculator
    //Write a program to calculate grade according to score (ex:A,B,C,D or E
    //A:90-100
    //B:80-90
    //C:70-80
    //D:60-70
    //E:0-59
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score :");
        int score = sc.nextInt();
        char grade = 'F';
        if(score >= 90 && score <= 100)
            grade = 'A';
        else if (score >= 80 && score <= 90) {
            grade = 'B';
        } else if (score >= 70 && score <= 80) {
            grade = 'c';
        } else if (score >= 60 && score <= 70) {
            grade = 'D';
        } else if (score >= 50 && score <= 60) {
            grade = 'E';
        }
        System.out.println("Grade of the student is:"+grade);

    }
    }
    
