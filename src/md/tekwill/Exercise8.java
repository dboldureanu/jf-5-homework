package md.tekwill;

import java.util.Scanner;

public class Exercise8 {

    /*
    Given an string array - determine the sum of the letters of the elements.
    IN: {"One", "Two", "Three"}
    OUT: 11
    */
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("please enter string");
        String val = s.nextLine();
        int len = val.length();
        for (int i = 0; i < len; i++) {
            if (val.charAt(i) == ' ') {
                continue;
            }
            sum++;
        }
        System.out.println(sum);
    }
}
