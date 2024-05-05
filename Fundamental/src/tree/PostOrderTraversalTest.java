package tree;

public class PostOrderTraversalTest {

    /**
     *          10
     *      20      30
     *           40     50
     *
     * postorder : 20 40 50 30 10
     */

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        printPostorderTraversal(root);
    }

    static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }

    }

    private static void printPostorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        printPostorderTraversal(root.left);
        printPostorderTraversal(root.right);
        System.out.print(root.key + " ");

    }
}


