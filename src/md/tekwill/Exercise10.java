package md.tekwill;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise10 {

    /*
    Given an array of strings and a letter,
    display the elements that contain the letter.
    IN: Array: {"One", "Two", "Three"}, Letter: e
    OUT: One, Three
    */
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        char letter;

        System.out.println("Enter the size of array");
        try
        {
            int size = in.nextInt();

            System.out.println("Enter the words");

            while (size-- >= 0)
                words.add(in.nextLine().toLowerCase());

            System.out.println("Enter the letter");
            letter = in.next().toLowerCase().replaceAll("[^a-zA-Z]", "").charAt(0);

            System.out.println("Words that contain letter "+letter +" are");

            for (String word : words)
                if (word.contains(Character.toString(letter)))
                System.out.println(word);

        }catch(InputMismatchException e){
            System.out.println(e.getClass().getName());}
    }
}
