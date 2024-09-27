package Examplefolder3;

import java.util.Scanner;

public class lab015 {
    public static void main(String[] args) {
        //grade calculator
        //Write a program to calculate grade according to score (ex:A,B,C,D or E
        //A:90-100
        //B:80-90
        //C:70-80
        //D:60-70
        //E:0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score :");
        int score = sc.nextInt();
        if(score >= 90 && score <= 100)
        {
            System.out.println("Student grade is A");
        } else if(score >= 80 && score <= 90) {
            System.out.println("Student grade is B");
        } else if (score >= 70 && score <= 80) {
            System.out.println("Student grade is C");
        } else if (score >= 60 && score <= 70) {
            System.out.println("Studesnt grade is D");
        }
        else if(score >= 0 && score <= 59) {
            System.out.println("Student grade is E");
        }
        else
            System.out.println("Entered score is not in the range between 0 to 100");

        sc.close();
    }
}
