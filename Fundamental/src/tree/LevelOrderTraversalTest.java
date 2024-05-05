package tree;

public class LevelOrderTraversalTest {

    static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }

    }

    /**
     *          10
     *      20      30
     *    8    7       6
     *        9  15
     *
     */

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.right = new Node(15);
        root.left.right.left = new Node(9);
        int height = heightOfATree(root);
        int i = 0;
        while( i < height ) {
            printKNodes(root, i);
            i++;
        }

    }

    private static int heightOfATree(Node root) {
        if (root == null) {
            return 0;
        } else  {
            return Math.max(heightOfATree(root.left), heightOfATree(root.right)) + 1;
        }
    }

    private static void printKNodes(Node root, int k) {
        if (root == null) return;
        if (k == 0) {
            System.out.print(root.key + " ");
        }
        else {
            printKNodes(root.left, k-1);
            printKNodes(root.right, k-1);
        }

    }


}
