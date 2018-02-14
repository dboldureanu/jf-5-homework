package md.tekwill;

import java.util.Scanner;

public class Exercise5 {

    /*
    Given a string, determine its length.
    IN: "Java"
    OUT: 4
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        System.out.println("Length = " + line.length());
    }
}
