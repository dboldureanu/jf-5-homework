package md.tekwill;

public class Exercise8 {

    /*
    Given an string array - determine the sum of the letters of the elements.
    IN: {"One", "Two", "Three"}
    OUT: 11
    */
    public static void main(String[] args) {
        String[] inputArray = {"One", "Two", "Three"};
        int length = 0;

        for (String inputElement : inputArray)
            length += inputElement.length();

        System.out.println(length);
    }
}
