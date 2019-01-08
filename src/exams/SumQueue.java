package exams;

public class SumQueue {

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
        tree.add(5);
        tree.add(9);
        System.out.println(size(tree.root));
    }

    static int size(BinaryTree.Node tree) {

        if (tree == null)
            return 0;
        return 1 + size(tree.left) + size(tree.right);
    }

}
