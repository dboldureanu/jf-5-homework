package md.tekwill;

import java.util.Scanner;

public class Exercise8 {

    /*
    Given an string array - determine the sum of the letters of the elements.
    IN: {"One", "Two", "Three"}
    OUT: 11
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type your word :");
        String[] x = s.nextLine().split("\\s");

        int sum = 0;
        for(int i = 0;i < x.length; i++)
            {
            int size = x[i].length();
              sum = sum+ size;
            }
         System.out.println("In your input are : " + sum + " letters");
    }
}



