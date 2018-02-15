package md.tekwill;

import java.lang.Character;

public class Exercise7 {

    /*
    Print and count the vowels in a string variable.
    Ex:
       Hello World!
       e
       o
       o
       Total: 3
    */
    public static void main(String[] args)
    {
        String word = "AAalphabet";
        char[] wordArray = word.toCharArray();
        char[] vowels = {'a','e','i','o','u'};
        int counter = 0;

        for (char letter : wordArray)
            for (char vowel : vowels)
                counter += Character.toLowerCase(letter) == vowel ? 1 : 0;

        System.out.println(counter);
    }
}
