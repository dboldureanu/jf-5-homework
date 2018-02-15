package md.tekwill;

import com.sun.org.apache.bcel.internal.generic.I2F;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {

    /*
    Write a program that would determine minimal number.
    Input: {14, 7}
    OUT: 7
    */
    static double  firstNumber, secondNumber;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter first number");
            firstNumber = in.nextDouble();

            System.out.println("Enter second number");
            secondNumber = in.nextDouble();

            if (firstNumber>secondNumber)
                System.out.println("The smallest number is: "+secondNumber);
            else if (firstNumber<secondNumber)
                System.out.println("The smallest number is: "+firstNumber);
            else
                System.out.println("Numbers are even");
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());}
    }
}
