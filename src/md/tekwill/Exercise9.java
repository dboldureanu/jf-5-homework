package md.tekwill;

import java.util.Scanner;

public class Exercise9 {

    /*
    Given an array of strings and a letter,
    display the elements starting with that letter.
    IN: Array: {"One", "Two", "Three"}, Letter: T
    OUT: Two, Three
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String letter = scanner.nextLine();
        String[] split = line.split(",");

        for(String s : split) {
            if(s.toLowerCase().startsWith(letter.toLowerCase())) {
                System.out.println(s);
            }
        }
    }
}
