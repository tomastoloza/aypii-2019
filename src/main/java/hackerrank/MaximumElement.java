package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

public class MaximumElement {

    static void readQueries() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            if (s.startsWith("1 ")) {
                int item = Integer.parseInt(s.split(" ")[1]);
                stack.push(item);
            } else if (s.startsWith("2")) {
                stack.pop();
            } else if (s.startsWith("3")) {
                Iterator<Integer> it = stack.iterator();
                int max = 0;
                while (it.hasNext()) {
                    Integer next = it.next();
                    max = (next > max ? next : max);
                }
                System.out.println(max);
            }

        }
    }

    public static void main(String[] args) throws IOException {
        readQueries();
    }
}
