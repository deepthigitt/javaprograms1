//given three input values represeting lengths of the sides, determine
//if the sides of traingle is equilateral(3 sides are equal)
//isocellus(exactly 2 sides are equal)
//scales(no sides are equal)
//use if-else statement
//side1,side2,side3
package Examplefolder3;

import java.util.Scanner;

public class lab017 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter side1:");
        int side1 = sc.nextInt();
        System.out.println("Enter side2:");
        int side2 = sc.nextInt();
        System.out.println("Enter side3");
        int side3 = sc.nextInt();
        if((side1 == side2) && (side1 == side3) && (side2 == side3))
            System.out.println("Traingle is Equilateral");
        else if (side1 == side2 || side1 == side3 || side2 == side3)
        {
            System.out.println("Traingle is Isolacellus");
        }
            else
            System.out.println("Taingle is scales ");


    }
}
