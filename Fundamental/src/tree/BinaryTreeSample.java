package tree;

public class BinaryTreeSample {
    public static void main(String[] args) {
        TreeNode root =  new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(50);
        root.left.right = new TreeNode(60);
        root.right.left = new TreeNode(80);

        System.out.println("\nIn order traversal -->");
        traverseInOrder(root);
        System.out.println("\nPre order traversal -->");
        traversePreOrder(root);
        System.out.println("\nPost order traversal -->");
        traversePostOrder(root);
    }

    private static void traversePostOrder(TreeNode root) {
        if (root != null ) {
            traversePostOrder(root.left);
            traversePostOrder(root.right);
            System.out.print(root.key + " ");
        }
    }

    private static void traversePreOrder(TreeNode root) {
        if (root != null ) {
            System.out.print(root.key + " ");
            traversePreOrder(root.left);
            traversePreOrder(root.right);
        }
    }

    private static void traverseInOrder(TreeNode root) {
        if (root != null ) {
            traverseInOrder(root.left);
            System.out.print(root.key + " ");
            traverseInOrder(root.right);
        }
    }
}
