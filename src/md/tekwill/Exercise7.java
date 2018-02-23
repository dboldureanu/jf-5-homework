package md.tekwill;
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
    String text = "Hello World!";
    char [] vowels = new char[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    char vow='a';
    int count=0;
    
    for(int i=0; i<text.length(); i++){
        char c = text.charAt(i);
       
        for (int j=0; j<vowels.length;j++ ){
            char d = vowels[j];
            if (c==d)  {vow = c; 
                        System.out.println(vow); 
                        count++;}
            }
    }
   
    System.out.println("Total: " + count); 
    }
}
