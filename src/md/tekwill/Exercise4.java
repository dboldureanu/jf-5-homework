package md.tekwill;

import java.util.Scanner;

public class Exercise4 {

    /*
    Write a program that would determine minimal and maximal numbers in an array.
    Input: {256, 16, 32, 8, 4, 512}
    OUT: Min: 4; Max: 512.
    */
    public static void main(String[] args) {
        int[] qArr = {256, 16, 32, 8, 4, 512};
        int min = qArr[0];
        int max = qArr[0];
        for (int x = 0; x < qArr.length; x++) {
            if (min > qArr[x]) min = qArr[x];{
                    if (max < qArr[x]) max = qArr[x];
                }
            }
        System.out.println("OUT: Min: "+min+"; "+"Max: "+max+"." );
    }

}


