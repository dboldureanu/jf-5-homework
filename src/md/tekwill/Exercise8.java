package md.tekwill;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise8 {

    /*
    Given an string array - determine the sum of the letters of the elements.
    IN: {"One", "Two", "Three"}
    OUT: 11
    */
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        int sum = 0;
        String tempWord;

        System.out.println("Enter the size of array");
        try
        {
            int size = in.nextInt();

            System.out.println("Enter the words");

            while (size-- > 0)
            {
                tempWord =in.nextLine().replaceAll("[^a-zA-Z]", "");
                if (tempWord.equals(""))
                {
                    size++;
                }
                else
                    words.add(tempWord);
            }
            for (String word : words)
                sum += word.length();

            System.out.println("The sum of letters of all words is " + sum);
        }catch(InputMismatchException e){
            System.out.println(e.getClass().getName());}
    }
}
