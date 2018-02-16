package md.tekwill;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise8 {

    /*
    Given an string array - determine the sum of the letters of the elements.
    IN: {"One", "Two", "Three"}
    OUT: 11
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String[] split = line.split(",");
        int sum = 0;

        for(String s : split) {
            sum += s.length();
        }

        System.out.println("Sum = " + sum);
    }
}
