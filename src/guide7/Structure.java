package guide7;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.TreeSet;

public class Structure {

    /**
     * ordenaría por longitud las cadenas de caracteres “corta”, “cadena muy larga”, “media”
     */
    public static void getStringLength(String[] strings) {

        PriorityQueue<StringLength> queue = new PriorityQueue<StringLength>();

        for (int i = 0; i < strings.length; i++) {
            queue.add(new StringLength(strings[i]));
        }

        StringLength f;
        while ((f = queue.poll()) != null)
            System.out.println(f);

    }

    /**
     * Devolver el conjunto de todas las letras que componen la palabra.
     *
     * @return
     */
    public static HashSet<Character> getLettersFromString(String string) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < string.toCharArray().length; i++) {
            hashSet.add(string.toCharArray()[i]);
        }
        return hashSet;
    }

    /**
     * Devolver el conjunto de todas las vocales que componen la palabra.
     *
     * @return
     */
    public static HashSet<Character> getVocalsFromString(String string) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < string.toCharArray().length; i++) {
            if (string.toCharArray()[i] == 'a' || string.toCharArray()[i] == 'e' || string.toCharArray()[i] == 'i' || string.toCharArray()[i] == 'o' || string.toCharArray()[i] == 'u') {
                hashSet.add(string.toCharArray()[i]);
            }
        }
        return hashSet;
    }

    /**
     * Devolver el conjunto de todas las consonantes que componen la palabra, ordenadas
     * alfabéticamente.
     *
     * @return
     */
    public static HashSet<Character> getConsonantsFromString(String string) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < string.toCharArray().length; i++) {
            if (!(string.toCharArray()[i] == 'a' || string.toCharArray()[i] == 'e' || string.toCharArray()[i] == 'i' || string.toCharArray()[i] == 'o' || string.toCharArray()[i] == 'u')) {
                hashSet.add(string.toCharArray()[i]);
            }
        }
        return hashSet;
    }

    /**
     * Mostrar en pantalla los elementos de la lista sin repetir.
    * */
    public static HashSet<Integer> get100randomList(){
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            integers.add((int) (Math.random()*51));
        }
        return integers;
    }


    public static void main(String[] args) {
        System.out.println(get100randomList());
    }

}
