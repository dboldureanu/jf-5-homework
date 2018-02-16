package md.tekwill;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6 {

    /*
    Write a program that would determine the longest line in a string array.
    {"Java", "Developer", "Software"}
    OUT: Developer
    */
    public static void main(String[] args) {
        ArrayList<String>  words = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String longestWord = null;

        System.out.println("Enter the size of array");
        try{
            int size = in.nextInt();

            System.out.println("Enter the words");
            while(size-->=0)
                words.add(in.nextLine().replaceAll("\\W",""));

            for (String word:words)
            {
                if (longestWord==null||word.length()>longestWord.length())
                    longestWord=word;
            }

            System.out.println("The longest word is: " + longestWord);
        }catch(InputMismatchException e){
            System.out.println(e.getClass().getName());}
    }
}
