package md.tekwill;

public class Exercise4
{

    /*
    Write a program that would determine minimal and maximal numbers in an array.
    Input: {256, 16, 32, 8, 4, 512}
    OUT: Min: 4; Max: 512.
    */
    public static void main(String[] args)
    {
        int[] inputArray = {1,2,3,4,5};
        int min = inputArray[0];
        int max = inputArray[0];

        for (int inputElement : inputArray)
        {
            min = inputElement < min ? inputElement : min;
            max = inputElement > max ? inputElement : max;
        }
        System.out.println("Min: " + min + "; Max " + max + ".");
    }
}
