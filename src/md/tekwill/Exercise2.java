package md.tekwill;

public class Exercise2 {

    /*
    Write a program that would determine minimal number.
    Input: {14, 7}
    OUT: 7
    */
    public static void main(String[] args) {
        int[] qwerty = {14, 7,};
        int min = qwerty[0];
        for (int x = 0; x < qwerty.length; x++) {
            if (min > qwerty[x])
                    min = qwerty[x];
        }
        System.out.println("The minimal number is : " + min);
    }
}

