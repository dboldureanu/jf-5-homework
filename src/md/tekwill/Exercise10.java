package md.tekwill;

import java.util.Scanner;

public class Exercise10 {

    /*
    Given an array of strings and a letter,
    display the elements that contain the letter.
    IN: Array: {"One", "Two", "Three"}, Letter: e
    OUT: One, Three
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String letter = scanner.nextLine();
        String[] split = line.split(",");

        for(String s : split) {
            if(s.toLowerCase().contains(letter.toLowerCase())) {
                System.out.println(s);
            }
        }
    }
}
