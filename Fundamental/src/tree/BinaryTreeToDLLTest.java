package tree;

import tree.DataUtil.TreeData;

public class BinaryTreeToDLLTest {

    private static TreeNode prev = null;
    public static void main(String[] args) {
        TreeNode root = TreeData.getThreeNodeTree();
        TreeNode head = convertBinaryTreeToDll(root);
        printDLL(head);
    }

    private static void printDLL(TreeNode head) {
        if (head == null) return;
        while(head != null) {
            System.out.print(head.key + " ");
            head = head.right;
        }
    }

    private static TreeNode convertBinaryTreeToDll(TreeNode root) {
        if(root == null ) return root;
        TreeNode head = convertBinaryTreeToDll(root.left);
        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        convertBinaryTreeToDll(root.right);
        return head;
    }

}
