package Examplefolder3;

import java.util.Scanner;

public class lab014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int num1 = sc.nextInt();
        System.out.println("Enter number2");
        int num2 = sc.nextInt();
        if(num1 == num2)
        {
            System.out.println("Both numbers are equal");
        }
        else
            System.out.println("Numbers are not equal");

        sc.close();

    }
}
