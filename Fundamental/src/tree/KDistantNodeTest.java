package tree;

public class KDistantNodeTest {

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
     *           40     50
     *                60     70
     *                     80   90
     *                         1
     *
     *
     */

    public static void main(String[] args) {
        int k = args.length > 0 ? (Integer.parseInt(args[0])) : 2;
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.right.left = new Node(60);
        root.right.right.right = new Node(70);
        root.right.right.right.left = new Node(80);
        root.right.right.right.right = new Node(90);
        root.right.right.right.right.left = new Node(1);
        printKNodes(root, k);

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
