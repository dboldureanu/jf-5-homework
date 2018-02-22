package md.tekwill;

import java.util.Scanner;

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
    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);
        System.out.println("Type your word :");
        String count = word.next();

        int sum = 0;
        char[] c = count.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a') {    //('y')('u')('i')('o')('e')
                sum++;
            }
        }
        System.out.println("In your word: " + count);
        System.out.println( "Total: " + sum +" vowels letters" );
    }
}