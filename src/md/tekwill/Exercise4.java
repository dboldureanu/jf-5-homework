package md.tekwill;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {

    /*
    Write a program that would determine minimal and maximal numbers in an array.
    Input: {256, 16, 32, 8, 4, 512}
    OUT: Min: 4; Max: 512.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        int[] ints = Arrays.stream(line.split(","))
                .mapToInt(Integer::parseInt) // or .summaryStatistics().getMax() .getMin()
                .toArray();

        int max = ints[0];
        int min = ints[0];
        for(int number : ints) {
            max = Math.max(max, number);
            min = Math.min(min, number);
        }

        System.out.println("Max = " + max + ", min = " + min);
    }
}
