package md.tekwill;

public class Exercise1 {

    /*
    Print a Celsius - Fahrenheit table from 0 to 300 with interval 10C
    0C - 32F
    10C - 50F
    20C - 68F
    30C - 86F
    ...
    300 - 572
    */
    public static void main(String[] args) {
        // write your code here
        int  c = 0, f = 32;

        for (c=0; c<=300; c+=10){
            f=c*9/5+32;
            System.out.println(c + "C - " + f+ "F");

        }
    }
}
