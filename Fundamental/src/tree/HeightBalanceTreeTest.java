package tree;

import tree.DataUtil.TreeData;

public class HeightBalanceTreeTest {

    public static void main(String[] args) {
        TreeNode root = TreeData.getBalancedHeightTree();
        System.out.println("Given tree is height balanced tree ? " + isHeightBalanced(root));

    }

    private static boolean isHeightBalanced(TreeNode root) {
        if (root == null) return  true;
        boolean flag = Math.abs(heightOfATree(root.left) -heightOfATree(root.right) ) <= 1 ;
        return flag && isHeightBalanced(root.left) && isHeightBalanced(root.right);
    }

    private static int heightOfATree(TreeNode root) {
        if (root == null) {
            return 0;
        } else  {
            return Math.max(heightOfATree(root.left), heightOfATree(root.right)) + 1;
        }
    }
}
