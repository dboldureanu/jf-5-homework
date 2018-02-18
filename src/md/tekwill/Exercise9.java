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

        System.out.println("Enter number of words");
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        String[] names = new String[val];
        System.out.println("Please Enter The "+val+" Words: ");

        for (int i = 0; i < val; i++) {
            names[i] = scanner.nextLine();
        }
        System.out.print("Enter starting alphabet: ");
        char start = scanner.next().charAt(0);
        for (int i = 0; i < val; i++) {
            char startingLetterOfName = names[i].charAt(0);
            if (startingLetterOfName == start) {
                System.out.println(names[i]);
            }
        }
    }
}
