package tree;

import tree.DataUtil.TreeData;

public class ChildrenSumProblemTest {

    public static void main(String[] args) {
        TreeNode root = TreeData.getChildrenSumTree();
        System.out.println("Given tree is children sum tree ? " + isChildrenSumTree(root));

    }


    //recursive
    private static boolean isChildrenSumTree(TreeNode root) {
        if (root == null) return true;
        if( root.left == null && root.right == null) return true;
        int sum = 0;
        if (root.left != null) {
            sum = sum + root.left.key;
        }
        if (root.right != null) {
            sum = sum + root.right.key;
        }

        return (root.key == sum) && isChildrenSumTree(root.left) && isChildrenSumTree(root.right);
    }


}
