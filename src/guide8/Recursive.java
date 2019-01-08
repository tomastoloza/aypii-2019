package guide8;

public class Recursive {

    /*Escribir un método recursivo que tome una palabra y diga si es un palíndromo
    (Palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a
    izquierda).*/
    static boolean isPalindrome(String string) {

        if (string.length() == 1) {
            return true;
        }

        if (string.charAt(0) == string.charAt(string.length()-1)) {
            return isPalindrome(string.substring(1, string.length()-1));
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("amadaladama"));
    }


}
