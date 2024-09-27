package Examplefolder3;

import java.util.Scanner;

public class lab013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter number2");
        int num2 = sc.nextInt();
        if (num1>num2)
        {
            System.out.println("Number1 is big");
        }
        else
            System.out.println("Number2 is big");


    }
}
