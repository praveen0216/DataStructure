package tree;

import tree.DataUtil.TreeData;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthBinaryTreeTest {

    public static void main(String[] args) {
        TreeNode root = TreeData.getBigTree();
        System.out.println("Maximum Width of the binary tree " + getMaxWidth(root));
    }

    private static int getMaxWidth(TreeNode root) {
        if (root == null ) return  0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        TreeNode currentNode;
        int max = Integer.MIN_VALUE;
        while(!q.isEmpty()) {
            int count = q.size();
            max  = Math.max(max, count);

            for(int i = 0 ; i< count; i++) {
                currentNode = q.poll();
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null ) {
                    q.add(currentNode.right);
                }
            }


        }
        return max;
    }

}
