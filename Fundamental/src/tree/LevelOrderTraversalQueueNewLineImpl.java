package tree;


import tree.DataUtil.TreeData;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalQueueNewLineImpl {

    public static void main(String[] args) {
        TreeNode root = TreeData.getTree();
        /*printLevelOrderLineByLineSolution1(root);
        System.out.println("--------------------------------------------------");*/
        printLevelOrderLineByLineSolution2(root);
    }

    private static void printLevelOrderLineByLineSolution1(TreeNode root) {
        if(root == null) return;
        TreeNode current = null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (queue.size() > 1) {
            current = queue.poll();
            if (current == null) {
                System.out.println();
                queue.add(null);
                continue;//current = queue.poll();
            }
            System.out.print(current.getKey() + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }

        }
    }

    private static void printLevelOrderLineByLineSolution2(TreeNode root) {
        if (root == null ) return;
        TreeNode current = null;
        int size = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            size = queue.size();

            while(size > 0) {
                current = queue.poll();
                System.out.print(current.getKey() + " ");
                if(current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
                size --;
            }
            System.out.println();
        }

    }

}
