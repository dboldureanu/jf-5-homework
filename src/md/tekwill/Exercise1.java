package md.tekwill;

/*public class Exercise1 {

    /*
    Print a Celsius - Fahrenheit table from 0 to 300 with interval 10C
    0C - 32F
    10C - 50F
    20C - 68F
    30C - 86F
    ...
    300 - 572

    public static void main(String[] args) {
        String[]
    }
}*/


public class Exercise1
{
    public static void main(String[] args)
    {
        int[] c, f;

        c = converter(300);
    }

    private static int[] converter(int size)
    {
        int[] c = new int[size + 1];
        int index, value;

        for (index = 0; index <= 300; index += 10)
        {
            value = index * 9 / 5 + 32;
            c[index] = value;
            System.out.println(index + "C - " + value + "F");
        }

        return c;
    }

}