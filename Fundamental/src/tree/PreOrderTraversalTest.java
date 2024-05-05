package tree;


public class PreOrderTraversalTest {
    /**
     *          10
     *      20      30
     *           40     50
     *
     *   preorder : 10 20 30 40 50
     */

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        printPreorderTraversal(root);
    }

    static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }

    }

    private static void printPreorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.key + " ");
        printPreorderTraversal(root.left);
        printPreorderTraversal(root.right);

    }
}
