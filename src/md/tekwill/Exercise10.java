package md.tekwill;

public class Exercise10 {

    /*
    Given an array of strings and a letter,
    display the elements that contain the letter.
    IN: Array: {"One", "Two", "Three"}, Letter: e
    OUT: One, Three
    */
    public static void main(String[] args) {
        String[] words = {"One", "Two", "Three"};
        char inputLetter = 'e';
        char[] wordArray;
        String output = "";

        for (String word : words)
        {
            wordArray = word.toCharArray();
            for (char wordLetter : wordArray)
            {
                if (Character.toLowerCase(wordLetter) == Character.toLowerCase(inputLetter))
                {
                    output += output.length() > 0 ? (", " + word) : word;
                    break;
                }
            }
        }
        System.out.println(output);
    }
}
