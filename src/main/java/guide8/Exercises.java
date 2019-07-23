package guide8;

public class Exercises {


    public static long findFactorial(int number) {
        if (number <= 1) {
            return number;
        } else {
            return 1 * findFactorial(number + 1);
        }
    }

    /**
     * Escriba un método recursivo que tome dos números enteros y calcule la multiplicación entre
     * ellos, usando sólo sumas.
     */
    static long multiply(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        } else {
            return b > 0 ? a + multiply(a, b - 1) : -a + multiply(a, b + 1);
        }
    }

    /**
     * Escribir un método recursivo que devuelva el cociente y el resto de la división entera mediante
     * resta sucesivas.
     */
    static long getCociente(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        } else {
            return b > 0 ? a - getCociente(a, b - 1) : -a + getCociente(a, b + 1);
        }
    }


    public static void main(String[] args) {
        System.out.println(getCociente(5, 12));
    }


}