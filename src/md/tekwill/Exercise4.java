package md.tekwill;

import java.util.Scanner;

public class Exercise4 {

    /*
    Write a program that would determine minimal and maximal numbers in an array.
    Input: {256, 16, 32, 8, 4, 512}
    OUT: Min: 4; Max: 512.
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type your numbers :");
        int q = s.nextInt();
        int[] qwerty = {q};
        int min = qwerty[0];
        int max = qwerty[0];
        for(int x = 0; x < qwerty.length; x++)
            if(min > qwerty[x]) min = qwerty[x];
        for(int x = 0; x < qwerty.length; x++)
           if(max < qwerty[x]) max = qwerty[x];

        System.out.println("OUT: Min: " + min + ";" + " Max: " + max + ".");

    }
}
