package tree;

import tree.DataUtil.TreeData;

import java.util.Stack;

public class InOrderIterativeSolution {
    public static void main(String[] args) {
        TreeNode root =  TreeData.getTree();
        inOrderTraversal(root);
        System.out.println();
        preOrderTraversal(root);
    }

    private static void preOrderTraversal(TreeNode root) {
        if(root == null) return;
        if(root.left == null && root.right == null) System.out.print(root.key);

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        TreeNode curr;
        while(!stack.isEmpty()) {
            curr = stack.pop();
            System.out.print(curr.key + " ");
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }

    }

    private static void inOrderTraversal(TreeNode root) {
        if (root == null) return;
        if ( root.left == null && root.right == null) System.out.print(root.key);

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()) {
            //all left nodes
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            System.out.print(curr.key + " ");
            curr = curr.right;

        }

    }
}


