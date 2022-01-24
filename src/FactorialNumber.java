public class FactorialNumber {

    public static void main(String[] args) {

        System.out.println("factorial(5) = 120 =?= " + factorial(50000));

        System.out.println("factorial(7) = 5040 =?= " + factorial(7));

        System.out.println("sumOfDigits(432) = 9 =?= " + sumOfDigits(432));

        System.out.println("pow(10, 4) = 10000 =?= " + pow(10, 4));

        System.out.println("fibonacci(6) = 8 =?= " + fibonacci(6));

    }
    /* 5 * 4 * 3 * 2 * 1 */
    public static long factorial(long number) {
        return (number <= 1 ? 1 : number * factorial(number - 1));
    }

    /*Berechnet die Ziffernsumme */
    public static int sumOfDigits(int value) {
        return 0;
    }

    /*Berechnet x hoch y "händisch" ohne Schleifene oder sonstigen Methoden */
    public static int pow(int x, int y) {
        return 0;
    }

    /* Berechnete die n. Fibonacci-Zahl
    * 1, 1, 2, 3, 5, 8, 13, 21
    * n = 6 => 8
    *  */
    public static int fibonacci(int n) {
        return 0;
    }
}
