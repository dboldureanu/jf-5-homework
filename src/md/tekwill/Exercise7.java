package md.tekwill;

import java.util.Scanner;
import java.util.Set;

public class Exercise7 {

    /*
    Print and count the vowels in a string variable.
    Ex:
       Hello World!
       e
       o
       o
       Total: 3
    */
    public static void main(String[] args) {
        String vowels = "aeoui";

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        int count = 0;

        for(Character c : line.toCharArray()) {
            if(vowels.contains(c.toString().toLowerCase())) {
                System.out.println(c);
                count++;
            }
        }

        System.out.println("Total:" + count);
    }
}
