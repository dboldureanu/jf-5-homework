package md.tekwill;

import java.util.Scanner;

public class Exercise2 {

    /*
    Write a program that would determine minimal number.
    Input: {14, 7}
    OUT: 7
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the comparable numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("The minimal number is");

        if (a>b) System.out.println(b);
        else if (b>a) System.out.println(a);
        else System.out.println("Damn...numbers are equal");

    }
}
