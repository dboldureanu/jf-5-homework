package md.tekwill;

import java.util.Scanner;

public class Exercise4 {

    /*
    Write a program that would determine minimal and maximal numbers in an array.
    Input: {256, 16, 32, 8, 4, 512}
    OUT: Min: 4; Max: 512.
    */
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a Value: ");
            int val = s.nextInt();

            if (val == 0) {
                break;
            }
            if (val < min) {
                min = val;
            }
            if (val > max) {
                max = val;
            }
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
