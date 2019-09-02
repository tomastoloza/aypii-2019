package hackerrank;


import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class BalancedBrackets {
    static String isBalanced(String s) {
        Stack<Character> characters = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{') {
                characters.push('}');
            } else if (c == '[') {
                characters.push(']');
            } else if (c == '(') {
                characters.push(')');
            } else if (!characters.isEmpty()) {
                if (c != characters.pop()) {
                    return "NO";
                }
            } else return "NO";
        }
        if (!characters.isEmpty()) {
            return "NO";
        }
        return "YES";
    }


    public static void main(String[] args) {
//        System.out.println(isBalanced("[{}]"));
//        System.out.println(isBalanced("{[(])}"));
//        System.out.println(isBalanced("{{[[(())]]}}"));
//        System.out.println(isBalanced("{}"));
//        System.out.println(isBalanced("[]{}"));
//        System.out.println(isBalanced("}][}}(}][))]"));
//        System.out.println(isBalanced("[](){()}"));
//        System.out.println(isBalanced("()"));
//        System.out.println(isBalanced("({}([][]))[]()"));
//        System.out.println(isBalanced("{)[](}]}]}))}(())("));
//        System.out.println(isBalanced("([[)"));
//        System.out.println(isBalanced("[()][{}()][](){}([{}(())([[{}]])][])[]([][])(){}{{}{[](){}}}()[]({})[{}{{}([{}][])}]"));
//        System.out.println(isBalanced("[()][{}[{}[{}]]][]{}[]{}[]{{}({}(){({{}{}[([[]][[]])()]})({}{{}})})}"));
//        System.out.println(isBalanced("(])[{{{][)[)])(]){(}))[{(})][[{)(}){[(]})[[{}(])}({)(}[[()}{}}]{}{}}()}{({}](]{{[}}(([{]"));
//        System.out.println(isBalanced("){[]()})}}]{}[}}})}{]{](]](()][{))])(}]}))(}[}{{)}{[[}[]"));
//        System.out.println(isBalanced("}(]}){"));
//        System.out.println(isBalanced("((]()(]([({]}({[)){}}[}({[{])(]{()[]}}{)}}]]{({)[}{("));
//        System.out.println(isBalanced("{}{({{}})}[][{{}}]{}{}(){{}[]}{}([[][{}]]())"));
//        System.out.println(isBalanced("(){}[()[][]]{}(())()[[([])][()]{}{}(({}[]()))()[()[{()}]][]]"));
//        System.out.println(isBalanced("()([]({}[]){}){}{()}[]{}[]()(()([[]]()))()()()[]()(){{}}()({[{}][]}[[{{}({({({})})})}]])"));
//        System.out.println(isBalanced("[]([{][][)(])}()([}[}(})}])}))]](}{}})[]({{}}))[])(}}[[{]{}]()[(][])}({]{}[[))[[}[}{(]})()){{(]]){]["));
//        System.out.println(isBalanced("{()({}[[{}]]()(){[{{}{[[{}]{}((({[]}{}()[])))]((()()))}(()[[[]]])((()[[](({([])()}))[]]))}]})}"));
//        System.out.println(isBalanced("()(){{}}[()()]{}{}"));
//        System.out.println(isBalanced("{}()([[]])({}){({[][[][[()]]{{}[[]()]}]})}[](())((())[{{}}])"));
//        System.out.println(isBalanced("{}(((){}){[]{{()()}}()})[]{{()}{(){()(){}}}}{()}({()(()({}{}()((()((([])){[][{()}{}]})))))})"));
//        System.out.println(isBalanced("][[{)())))}[)}}}}[{){}()]([][]){{{{{[)}]]{([{)()][({}[){]({{"));
//        System.out.println(isBalanced("{{}("));
//        System.out.println(isBalanced("}["));
    }
}
