package tree;

public class HeightOfaTreeTest {


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
     * height = 6
     */

    public static void main(String[] args) {
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
        System.out.println(heightOfATree(root));
    }



    private static int heightOfATree(Node root) {
        if (root == null) {
            return 0;
        } else  {
            return Math.max(heightOfATree(root.left), heightOfATree(root.right)) + 1;
        }
    }
}
