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
        String[] myString1 = {"One","Two","Three","Four","Five"};
        for (int i = 0; i < 5; i++) {
            if (myString1[i].contains("e")){
                System.out.println(myString1[i]);
            }
        }
    }
}
