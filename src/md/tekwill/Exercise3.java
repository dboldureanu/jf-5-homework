package md.tekwill;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

    /*
    Write a program that would determine minimal number in an array.
    Input: {256, 16, 32, 8, 4, 512}
    OUT: 4
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        int[] ints = Arrays.stream(line.split(","))
                .mapToInt(Integer::parseInt) // or .min()
                .toArray();

        int min = ints[0];
        for(int number : ints) {
            min = Math.min(min, number);
        }

        System.out.println(min);
    }
}
