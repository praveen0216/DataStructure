package tree;

import tree.DataUtil.TreeData;

public class BTToDLLTest {

    private static TreeNode prev = null;
    public static void main(String[] args) {
        TreeNode root = TreeData.getThreeNodeTree();
        convertBTToDLL(root);

    }

    private static TreeNode convertBTToDLL(TreeNode root) {
        if (root == null) return root;
        TreeNode head = convertBTToDLL(root.left);
        if (prev == null) {
            head = root;
        } else if (prev != null) {
            prev.right = root;
            root.left = prev;
        }
        prev = root;
        convertBTToDLL(root.right);
        return head;
    }
}
