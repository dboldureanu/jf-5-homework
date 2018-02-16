package md.tekwill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {

    /*
    Write a program that would determine minimal and maximal numbers in an array.
    Input: {256, 16, 32, 8, 4, 512}
    OUT: Min: 4; Max: 512.
    */
    public static void main(String[] args) {
        try{
            ArrayList<Double> numbers = new ArrayList<Double>();

            Scanner in = new Scanner(System.in);

            System.out.println("Enter the size of array");

            int size = in.nextInt();

            System.out.println("Enter the numbers");

            while(size-->0)
                numbers.add(in.nextDouble());

            Collections.sort(numbers);

            System.out.println("The smallest number is: "+numbers.get(0));
            System.out.println("The biggest number is: "+numbers.get(numbers.size()-1));
        }

        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());}
    }
}
