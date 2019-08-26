package exams;

public class RecursionTree {

    static int sum(BinaryTree.Node tree) {
        if (tree == null) {
            return 0;
        }
        return sum(tree.left) + sum(tree.right) + tree.value;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(13);
        tree.add(12);
        tree.add(4);
        tree.add(6);
        tree.add(10);
//        System.out.println(getQuantityOfNodesAboveTen(tree.root));
        System.out.println(getMultiplosDeSeis(tree.root));
    }

    static int size(BinaryTree.Node tree) {

        if (tree == null)
            return 0;
        return 1 + size(tree.left) + size(tree.right);
    }

    /**
     * Dado un árbol binario de enteros, escribir un método recursivo que calcule (y devuelva) la cantidad de nodos cuyo valor es mayor
     * o igual que 10. Por ejemplo, en el árbol de la figura debe devolver 5 (contando el 10, el 11, el 12, el 13 y el 14).
     */
    static int getQuantityOfNodesAboveTen(BinaryTree.Node tree) {
        int count = 0;
        if (tree == null)
            return 0;
        if (tree.value >= 10)
            count++;
        return count + getQuantityOfNodesAboveTen(tree.left) + getQuantityOfNodesAboveTen(tree.right);
    }

    /**
     * Dado un árbol binario de enteros, escribir un método recursivo que calcule (y devuelva) la suma de todas los nodos cuyo valor es
     * múltiplo de 6. Por ejemplo, en el árbol de la figura debe devolver 6 + 12 (=18)
     */
    static double getMultiplosDeSeis(BinaryTree.Node tree) {
        int sum = 0;
        if (tree == null) {
            return 0;
        }
        if (tree.value % 6 == 0) {
            sum = tree.value;
        }
        return sum + getMultiplosDeSeis(tree.left) + getMultiplosDeSeis(tree.right);
    }
}
