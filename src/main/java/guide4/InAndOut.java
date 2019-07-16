package guide4;

import java.io.*;
import java.nio.charset.Charset;

public class InAndOut {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * cantPalabras: lee una línea de caracteres ingresada por teclado e imprime en pantalla la
     * cantidad de palabras que contiene.
     */
    private static void countWords() {
        try {
            System.out.println("I will count your words. Enter a phrase");
            System.out.println(bufferedReader.readLine().split(" ").length);
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }

    /**
     * cuentaPalabra: recibe una palabra y un archivo; y cuenta cuántas veces aparece esa
     * palabra en el archivo.
     */
    private static void countWord(String word, String fileLocation) {
        try {
            String[] file = new BufferedReader(new FileReader(fileLocation)).readLine().toLowerCase().split(" ");
            int quantityOfWords = 0;
            for (int i = 0; i < file.length; i++) {
                if (file[i].equals(word.toLowerCase())) {
                    quantityOfWords++;
                }
            }
            System.out.println("The word " + word + " has appeared " + quantityOfWords + " time(s) in the file " + fileLocation);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


    /**
     * almacenarLinea: lee una línea de caracteres ingresada por teclado y la escribe en un
     * archivo.
     */
    private static void saveLine() {
        try {
            FileWriter file = new FileWriter("src/main/resources/guide4/savedLine.txt");
            System.out.println("I will save your words. Enter a phrase");
            file.write(bufferedReader.readLine());
            file.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
//        saveLine();
//        countWord("falopa", "src/main/resources/guide4/falopita.txt");
//        countWords();
    }

}
