package tree;

import tree.DataUtil.TreeData;

import java.util.LinkedList;
import java.util.Queue;

public class MaxInBinaryTreeTest {

    public static void main(String[] args) {
        TreeNode root  = TreeData.getTree();
        System.out.print(maxOfBinaryWithQueue(root));
    }

    private static int maxOfBinary(TreeNode root) {
        if (root == null ) return Integer.MIN_VALUE;
        return Math.max(root.key, Math.max(maxOfBinary(root.left), maxOfBinary(root.right)));
    }

    private static int maxOfBinaryWithQueue(TreeNode root) {
        if (root == null ) return Integer.MIN_VALUE;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int max = Integer.MIN_VALUE;
        TreeNode current = null ;
         while (!q.isEmpty()) {
             current = q.poll();
             max =  Math.max(max, current.getKey());

             if(current.left != null) {
                 q.add(current.getLeft());
             }
             if(current.right != null) {
                 q.add(current.getRight());
             }
         }
       return max;
    }
}
