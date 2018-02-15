package md.tekwill;

public class Exercise2 {

    /*
    Write a program that would determine minimal number.
    Input: {14, 7}
    OUT: 7
    */
    public static void main(String[] args)
    {
        int[] inputArray = {1,2,3,4,5};
        int min = inputArray[0];

        for (int inputElement : inputArray)
            min = inputElement < min ? inputElement : min;

        System.out.println(min);
    }
}
