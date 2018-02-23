package md.tekwill;



public class Exercise4 {



    /*

    Write a program that would determine minimal and maximal numbers in an array.

    Input: {256, 16, 32, 8, 4, 512}

    OUT: Min: 4; Max: 512.

    */

    public static void main(String[] args) {

       int numbers[] = {256, 16, 32, 8, 4, 512};

     int  min=numbers[0], max=numbers[0];

     for(int i=0; i<numbers.length; i++){

         if (min>numbers[i]) min = numbers[i];
         if (max<numbers[i]) max = numbers[i];

     }

    System.out.println("Min: " + min + "\nMax: "+ max);

    }

}
