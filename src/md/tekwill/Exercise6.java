package md.tekwill;

public class Exercise6 {

    /*
    Write a program that would determine the longest line in a string array.
    {"Java", "Developer", "Software"}
    OUT: Developer
    */
    public static void main(String[] args)
    {
        String[] inputArray = {"Java", "Developer", "Software"};
        String maxElement = "";

        for (String inputElement : inputArray)
            maxElement = inputElement.length() > maxElement.length() ? inputElement : maxElement;

        System.out.println(maxElement);
    }
}
