package md.tekwill;

public class Exercise6 {

    /*

    Write a program that would determine the longest line in a string array.

    {"Java", "Developer", "Software"}

    OUT: Developer

    */

    public static void main(String[] args) {

        String[] text = new String[]{"Java", "Developer", "Software"};
        
        int maxtext=text[0].length(), maxpos=0;
        
        for(int i=0; i<text.length; i++){

        if (maxtext<text[i].length()) {maxtext = text[i].length(); maxpos = i;}
        
     }
     
      System.out.println("The longest line in the string array is \"" + text[maxpos] + "\" with length = " + maxtext);
    }

}
