package md.tekwill;

import java.util.Scanner;

public class Exercise6 {

    /*
    Write a program that would determine the longest line in a string array.
    {"Java", "Developer", "Software"}
    OUT: Developer
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type your words :"); //"Java", "Developer", "Software"
        String[] x = s.nextLine().split("\\s");

        int sum = 0;
        for(int i = 0;i < x.length; i++)
        {
            //  sum = sum+ size;
        }

        System.out.println("the longest line in an array are: " + x);
    }
}
