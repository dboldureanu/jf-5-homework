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
        String word;
        Scanner in = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter the string");
        word = in.nextLine().toLowerCase().replaceAll("[^a-z]", "");

        for (int i = 0;i<word.length();i++)
        {
            if (word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'
                    ||word.charAt(i)=='o'||word.charAt(i)=='u'||word.charAt(i)=='y')
            {
                count++;
                System.out.println(word.charAt(i));
            }
        }
        System.out.println("The number of vowels is: "+count);

    }
}
