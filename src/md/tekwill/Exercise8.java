package md.tekwill;

public class Exercise8 {
    /*
    Given an string array - determine the sum of the letters of the elements.
    IN: {"One", "Two", "Three"}
    OUT: 11
    */

    public static void main(String[] args) {
        
    String[] text = new String[]{"One", "Two", "Three"};    
   
    int count=0;
    
    for(int i=0; i<text.length; i++){
         String word = new String (text[i]);
         
            for (int j=0; j<word.length();j++ ){
                /* in case needed to print every char
                * char d = word.charAt(j);
                * System.out.println(d); */
                count++;
             }
    }
   
    System.out.println("Total: " + count); 
  }
}
