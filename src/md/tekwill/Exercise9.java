package md.tekwill;
public class Exercise9 {
    /*
    Given an array of strings and a letter,
    display the elements starting with that letter.
    IN: Array: {"One", "Two", "Three"}, Letter: T
    OUT: Two, Three
    */

    public static void main(String[] args) {

    String[] text = new String[]{"One", "Two", "Three"};    
    char letter='T';

    for(int i=0; i<text.length; i++){
         String word = new String (text[i]);

            for (int j=0; j<word.length();j++){
                char w = word.charAt(j);

                if (w == letter && j==0) System.out.println(word);

            }

        } 

    }

}
