package tree;


import tree.DataUtil.TreeData;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalQueueImpl {

    public static void main(String[] args) {
        TreeNode root = TreeData.getTree();
        TreeNode current = null;
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            current = queue.poll();
            System.out.print(current.getKey() + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }

        }

    }

}
