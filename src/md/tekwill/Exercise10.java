package md.tekwill;

import com.sun.deploy.util.StringUtils;

public class Exercise10 {

    /*
    Given an array of strings and a letter,
    display the elements that contain the letter.
    IN: Array: {"One", "Two", "Three"}, Letter: e
    OUT: One, Three
    */
    public static void main(String[] args) {
        String[] myArr = {"One","Two","Three"};
        String word = new String();

        int sum = 0;

        char[] c = word.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'e') {    //('y')('u')('i')('o')('e')
                sum++;
            }
        }
    }
}
