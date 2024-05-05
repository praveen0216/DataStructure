package tree;

public class InOrderTraversalTest {

    /**
     *          10
     *      20      30
     *           40     50
     *
     * inorder : 20 10 40 30 50
     */

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        printInorderTraversal(root);
    }

    static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }

    }

    private static void printInorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        printInorderTraversal(root.left);
        System.out.print(root.key + " ");
        printInorderTraversal(root.right);

    }
}


