package md.tekwill;

import java.lang.Character;

public class Exercise9 {

    /*
    Given an array of strings and a letter,
    display the elements starting with that letter.
    IN: Array: {"One", "Two", "Three"}, Letter: T
    OUT: Two, Three
    */
    public static void main(String[] args)
    {
        String[] words = {"One", "Two", "Three"};
        char inputLetter = 'T';
        char[] wordArray;
        String output = "";

        for (String word : words)
        {
            wordArray = word.toCharArray();

            // Ternary hell, should have gone with ifs but it's too late now...
            output += (Character.toLowerCase(wordArray[0]) == Character.toLowerCase(inputLetter) ? output.length() > 0 ? (", " + word) : word : "");
        }

        System.out.println(output);
    }
}
