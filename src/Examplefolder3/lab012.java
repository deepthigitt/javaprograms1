package Examplefolder3;

import java.util.Scanner;

public class lab012 {
    public static void main(String[] args) {
        Object system;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (num%2 == 0)
        {
            System.out.println("Nuber is even");
        }
        else
            System.out.println("Number is odd");


    }
}
