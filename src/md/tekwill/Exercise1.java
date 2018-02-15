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

        double fahrenheit;

        for (int celsius = 0; celsius <= 300; celsius += 10)
        {
            fahrenheit = celsius * 1.8 + 32;
            System.out.println(celsius + "C - " + (int) fahrenheit + "F");
        }
    }
}
