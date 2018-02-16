package md.tekwill;


import java.util.Scanner;
import java.util.StringTokenizer;

import static sun.plugin2.os.windows.OSVERSIONINFOA.size;

public class Exercise5 {

    /*
    Given a string, determine its length.
    IN: "Java"
    OUT: 4
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type your word :");
        String x = s.nextLine();
        System.out.println("In your word are : " + x.length() + " letters");
    }
}
