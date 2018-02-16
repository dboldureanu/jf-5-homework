package md.tekwill;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise9 {

    /*
    Given an array of strings and a letter,
    display the elements starting with that letter.
    IN: Array: {"One", "Two", "Three"}, Letter: T
    OUT: Two, Three
    */
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        int sum = 0;
        char letter;
        String tempWord;
        System.out.println("Enter the size of array");
        try
        {
            int size = in.nextInt();

            System.out.println("Enter the words");

            while (size-- > 0) {
                tempWord =in.nextLine().toLowerCase();
                if (tempWord.equals(""))
                    size++;
                else
                    words.add(tempWord);
            }
            System.out.println("Enter the letter");
            letter = in.next().toLowerCase().replaceAll("[^a-zA-Z]", "").charAt(0);

            System.out.println("The words starting with " + letter + " are ");

            for (String word:words)
                if (word.charAt(0) == letter)
                    System.out.println(word);

        }catch(InputMismatchException e){
            System.out.println(e.getClass().getName());}
    }
}
