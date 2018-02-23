package md.tekwill;
public class Exercise10 {
    /*
    Given an array of strings and a letter,
    display the elements that contain the letter.
    IN: Array: {"One", "Two", "Three"}, Letter: e
    OUT: One, Three
    */
     public static void main(String[] args) {

    String[] text = new String[]{"One", "Two", "Three"};    
    char letter='w';
        
    
    for(int i=0; i<text.length; i++){
         String word = new String (text[i]);
         
            for (int j=0; j<word.length();j++){
                char w = word.charAt(j);
               
                if (w == letter) System.out.println(word);
            }
           
        } 
    }
}
