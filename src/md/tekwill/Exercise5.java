package md.tekwill;

import java.util.Scanner;

public class Exercise5 {

    /*
    Given a string, determine its length.
    IN: "Java"
    OUT: 4
    */
    public static void main(String[] args) {
        System.out.println("Please enter a string: ");
        Scanner s = new Scanner(System.in);
        String c = s.nextLine();
        System.out.print("The length is: "+c.length());
    }
}
