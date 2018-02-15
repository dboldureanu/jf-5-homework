package md.tekwill;

import java.util.Scanner;

public class Exercise5 {

    /*
    Given a string, determine its length.
    IN: "Java"
    OUT: 4
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the word");

        String word = in.next();

        System.out.println("The length of the word is: "+word.length());
    }
}
