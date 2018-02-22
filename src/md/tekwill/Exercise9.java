package md.tekwill;

import java.util.Scanner;

public class Exercise9 {

    /*
    Given an array of strings and a letter,
    display the elements starting with that letter.
    IN: Array: {"One", "Two", "Three"}, Letter: T
    OUT: Two, Three
    */
    public static void main(String[] args) {
//        Scanner word = new Scanner(System.in);
//        System.out.println("Type your word :");
        String [] words = {"One", "Two", "Three"};          //word.nextLine;
//        Scanner startLetter = new Scanner(System.in);
//        System.out.println("Input letter for search: ");
//        String letterInput = startLetter.nextLine();

        for(int i = 0; i< words.length; i++){
            char x = words[i].charAt('T');
            }
//        System.out.println(words[0]);
        System.out.println("OUT: "+ words);
        }

    }


