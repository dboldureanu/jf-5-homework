package md.tekwill;

import java.util.Scanner;

public class Exercise3 {

    /*
    Write a program that would determine minimal number in an array.
    Input: {256, 16, 32, 8, 4, 512}
    OUT: 4
    */
    public static void main(String [] args) {
        int max = Integer.MIN_VALUE;

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a Value: ");
            int val = s.nextInt();

            if (val == 0) {
                break;
            }else if (val > max) {
                max = val;
            }
        }

        System.out.println("max: " + max);
    }
}
