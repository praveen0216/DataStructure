package tree;

public class BreathTraversalTest {

    public static void main(String[] args) {
            TreeNode root =  new TreeNode(10);
            root.left = new TreeNode(20);
            root.right = new TreeNode(30);
            root.left.left = new TreeNode(50);
            root.left.right = new TreeNode(60);
            root.right.left = new TreeNode(80);

            System.out.println("\n Breadth traversal -->");
            breathTraversal(root);

        }

    private static void breathTraversal(TreeNode root) {
        if (root == null) return;
        if (root != null) {
            System.out.print(root.key + " ");
            System.out.print(root.left.key + " ");
            System.out.print(root.right.key + " ");
        }
    }
}
