package guide6;

import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class QueueAndStack {

    static String revertString(String string) {
        String reverted = "";
        Stack<Character> stack = new Stack<Character>();

        for (Character c : string.toCharArray())
            stack.push(c);
        while (!stack.isEmpty())
            reverted += stack.pop();
        return reverted;
    }

    static Set getCharacters(String string) {
        Set set = new TreeSet<Character>();
        for (char c : string.toCharArray()){
            set.add(c);
        }
        return set;

    }

    public static void main(String[] args) {
        System.out.println(getCharacters("holhuadsjsajdhalksjsdakhda"));
    }
}
