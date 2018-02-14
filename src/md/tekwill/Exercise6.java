package md.tekwill;

import java.util.Scanner;

public class Exercise6 {

    /*
    Write a program that would determine the longest line in a string array.
    {"Java", "Developer", "Software"}
    OUT: Developer
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split(",");

        String temp = words[0];
        int tempLength = words[0].length();

        for(String word : words) {
            if(word.length() > tempLength) {
                tempLength = word.length();
                temp = word;
            }
        }

        System.out.println("Longest word = " + temp);

    }
}
