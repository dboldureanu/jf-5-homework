package md.tekwill;

import java.util.Scanner;

public class Exercise6 {

    /*
    Write a program that would determine the longest line in a string array.
    {"Java", "Developer", "Software"}
    OUT: Developer
    */
    public static String getLongestString(String[] array) {
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of strings");
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        System.out.println("Please Enter The "+val+" Strings: ");

        String longest = "";

        for(int i=0; i<val; i++){
            System.out.print("Enter String "+(i+1)+": ");
            String str=input.nextLine();
            if( str.length() > longest.length() )
            {
                longest = str;
            }
        }
        System.out.println("The Largest String is "+ longest);
}}
