package hackerrank;


import java.util.PriorityQueue;
import java.util.Queue;

public class BalancedBrackets {

    static String isBalanced(String s) {

        Queue queue = new PriorityQueue<Character>();
        for (char r : s.toCharArray()) {
            if (r == '[')
                queue.add(']');
            else if (r == '{')
                queue.add('}');
            else if (r == '(')
                queue.add(')');
            else {
                if(!queue.poll().equals(r)){
                    return "NO";
                }
            }

        }
        return "YES";
    }


    public static void main(String[] args) {
        System.out.println(isBalanced("[{}]"));
        System.out.println(isBalanced("{[(])}"));
        System.out.println(isBalanced("{{[[(())]]}}"));
        System.out.println(isBalanced("{}"));
        System.out.println(isBalanced("[]{}"));
        ;
    }
}
