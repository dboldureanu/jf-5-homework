package md.tekwill;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
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

        for(String word : words) {
            if(word.length() > temp.length()) {
                temp = word;
            }
        }

        System.out.println("Longest word = " + temp);


        /** Or
         *   String max = Arrays.stream(words)
         *     .max(Comparator.comparingInt(String::length))
         *     .orElse(null);
         */
    }
}
