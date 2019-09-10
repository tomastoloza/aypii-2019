package hackerrank;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RamsonNote {

    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> words = new HashMap<>();
        boolean isRansom = true;
        for (String word : magazine) {
            if (words.get(word) == null) {
                words.put(word, 1);
            } else {
                words.put(word, words.get(word) + 1);
            }
        }

        try {
            for (String word : note) {
                if (words.get(word) < 1) {
                    isRansom = false;
                } else {
                    words.put(word, words.get(word) - 1);
                }
            }
        } catch (NullPointerException e) {
            isRansom = false;
        }
        System.out.println(isRansom ? "Yes" : "No");
    }

    public static void main(String[] args) {
        checkMagazine("two times three is not four".split(" "), "two times two is four".split(" "));
        checkMagazine("ive got a lovely bunch of coconuts".split(" "), "ive got some coconuts".split(" "));
        checkMagazine("give me one grand today night".split(" "), "give one grand today".split(" "));
        checkMagazine("give give not Give".split(" "), "give one grand today".split(" "));
    }
}
