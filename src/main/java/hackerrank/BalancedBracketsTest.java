package hackerrank;

import org.junit.Test;

import static hackerrank.BalancedBrackets.isBalanced;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void assertIsBalanced() {
        assertEquals(isBalanced("[()][{}()][](){}([{}(())([[{}]])][])[]([][])(){}{{}{[](){}}}()[]({})[{}{{}([{}][])}]"), "YES");
        assertEquals(isBalanced("[()][{}[{}[{}]]][]{}[]{}[]{{}({}(){({{}{}[([[]][[]])()]})({}{{}})})}"), "YES");
        assertEquals(isBalanced("(])[{{{][)[)])(]){(}))[{(})][[{)(}){[(]})[[{}(])}({)(}[[()}{}}]{}{}}()}{({}](]{{[}}(([{]"), "NO");
        assertEquals(isBalanced("){[]()})}}]{}[}}})}{]{](]](()][{))])(}]}))(}[}{{)}{[[}[]"), "NO");
        assertEquals(isBalanced("}(]}){"), "NO");
        assertEquals(isBalanced("((]()(]([({]}({[)){}}[}({[{])(]{()[]}}{)}}]]{({)[}{("), "NO");
        assertEquals(isBalanced("{}{({{}})}[][{{}}]{}{}(){{}[]}{}([[][{}]]())"), "YES");
        assertEquals(isBalanced("(){}[()[][]]{}(())()[[([])][()]{}{}(({}[]()))()[()[{()}]][]]"), "YES");
        assertEquals(isBalanced("()([]({}[]){}){}{()}[]{}[]()(()([[]]()))()()()[]()(){{}}()({[{}][]}[[{{}({({({})})})}]])"), "YES");
        assertEquals(isBalanced("[]([{][][)(])}()([}[}(})}])}))]](}{}})[]({{}}))[])(}}[[{]{}]()[(][])}({]{}[[))[[}[}{(]})()){{(]]){]["), "NO");
        assertEquals(isBalanced("{()({}[[{}]]()(){[{{}{[[{}]{}((({[]}{}()[])))]((()()))}(()[[[]]])((()[[](({([])()}))[]]))}]})}"), "YES");
        assertEquals(isBalanced("()(){{}}[()()]{}{}"), "YES");
        assertEquals(isBalanced("{}()([[]])({}){({[][[][[()]]{{}[[]()]}]})}[](())((())[{{}}])"), "YES");
        assertEquals(isBalanced("{}(((){}){[]{{()()}}()})[]{{()}{(){()(){}}}}{()}({()(()({}{}()((()((([])){[][{()}{}]})))))})"), "YES");
        assertEquals(isBalanced("][[{)())))}[)}}}}[{){}()]([][]){{{{{[)}]]{([{)()][({}[){]({{"), "NO");
        assertEquals(isBalanced("{{}("), "NO");
    }
}