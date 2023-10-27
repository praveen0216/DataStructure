package tree;

public class TreeHeightTest {

    public static void main(String[] args) {
        TreeNode root =  new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(50);
        root.left.right = new TreeNode(60);
        root.right.left = new TreeNode(80);

        printHeightOfTree(root);
        printNodeOfKDistance(root, 2);
    }

    private static void printNodeOfKDistance(TreeNode root, int k) {
        if (root == null) return;
        if (k == 0) System.out.print(root.key + " ");
        else {
            printNodeOfKDistance(root.left, k-1);
            printNodeOfKDistance(root.right, k-1);
        }
    }

    private static void printHeightOfTree(TreeNode root) {
        System.out.println(height(root));
    }

    private static int height(TreeNode root) {
        if(root == null) return 0;
        else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }
}
