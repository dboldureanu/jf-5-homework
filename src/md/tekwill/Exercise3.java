package md.tekwill;

public class Exercise3 {

    /*
    Write a program that would determine minimal number in an array.
    Input: {256, 16, 32, 8, 4, 512}
    OUT: 4
    */
    public static void main(String[] args) {
        int[] qwerty = {256, 16, 32, 8, 4, 512};
        int min = qwerty[0];
            for(int x = 0; x < qwerty.length; x++)
            {
                if(min > qwerty[x]) min = qwerty[x];
            }
                System.out.println("The minimal number in an array is : " + min);
        }

}
