package tree;

import tree.DataUtil.TreeData;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewBinaryTreeTest {

    private static int maxlevel = 0;

    public static void main(String[] args) {
        TreeNode root = TreeData.getTree();
       // printLeftView(root);
        System.out.println();
        printLeftViewRecursive(root);
    }

    private static void printLeftViewRecursive(TreeNode root) {
        printLeftViewRecursive(root, 1)  ;
    }

    private static void printLeftViewRecursive(TreeNode root, int level) {
        if (root == null) return;
        if (maxlevel < level) {
            System.out.print(root.key + " ");
            maxlevel = level;
        }
        printLeftViewRecursive(root.left, level + 1);
        printLeftViewRecursive(root.right, level + 1);
    }

    private static void printLeftView(TreeNode root) {
        if (root == null ) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        TreeNode currentNode =  null;

        while(!q.isEmpty()) {

            int size = q.size();

            for(int i = 0 ; i< size ; i ++) {
                currentNode = q.poll();
                if (i == 0) {
                    System.out.print(currentNode.key + " ");
                }
                if(currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if(currentNode.right != null) {
                    q.add(currentNode.right);
                }

            }
        }
    }
}
