package hackerrank;

import java.util.HashMap;
import java.util.HashSet;

public class TwoStrings {

    static String twoStrings(String s1, String s2) {
        HashMap<Character, Integer> characters = new HashMap<>();
        for (char c : s1.toCharArray()) {
            characters.put(c, 0);
        }
        System.out.println(characters);
        try {
            for (char c : s2.toCharArray()) {
                if (!(characters.get(c) == null)) {
                    return "YES";
                }
            }
        } catch (NullPointerException ignored) {

        }
        return "NO";
    }

    public static void main(String[] args) {
//        System.out.println(twoStrings("hello", "hello"));
//        System.out.println(twoStrings("hello", "ala"));
//        System.out.println(twoStrings("fan", "sxn"));
        System.out.println(twoStrings("cat", "ef"));
    }


}
