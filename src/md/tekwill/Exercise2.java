package md.tekwill;

import java.util.Scanner;

public class Exercise2 {

    /*
    Write a program that would determine minimal number.
    Input: {14, 7}
    OUT: 7
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int min = (first >= second) ? first : second;

        System.out.println("Max = " + min);
    }
}
