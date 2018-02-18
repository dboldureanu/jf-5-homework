package md.tekwill;

    /*
    Write a program that would determine minimal number.
    Input: {14, 7}
    OUT: 7
    */
import java.util.Scanner;

public class Exercise2 {
        public static void main(String [] args) {
            int min = Integer.MAX_VALUE;

            Scanner s = new Scanner(System.in);
            while (true) {
                System.out.print("Enter a Value: ");
                int val = s.nextInt();

                if (val == 0) {
                    break;
                }else if (val < min) {
                    min = val;
                }
            }

            System.out.println("min: " + min);
        }
}

