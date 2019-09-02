package hackerrank;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;

public class RamsonNote {

    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Boolean> dict = new HashMap<>();
        boolean isPosible = true;
        for (String word : magazine) {
            dict.put(word, true);
        }
        for (String word : note) {
            if (dict.get(word) == null) {
                isPosible = false;
            }
        }
        System.out.println((isPosible) ? "Yes" : "No");
    }

    public static void main(String[] args) {
        checkMagazine("two times three is not four".split(" "), "two times two is four".split(" "));
        checkMagazine("ive got a lovely bunch of coconuts".split(" "), "ive got some coconuts".split(" "));
        checkMagazine("give me one grand today night".split(" "), "give one grand today".split(" "));
    }
}
