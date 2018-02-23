package md.tekwill;



public class Exercise3 {



    /*

    Write a program that would determine minimal number in an array.

    Input: {256, 16, 32, 8, 4, 512}

    OUT: 4

    */

    public static void main(String[] args) {

     int numbers[] = {256, 16, 32, 8, 4, 512};
     int  min=numbers[0];
     for(int i=0; i<numbers.length; i++){
        
         if (min>numbers[i]) min = numbers[i];
     }
    System.out.println("The minimal number is " + min);
    }

}
