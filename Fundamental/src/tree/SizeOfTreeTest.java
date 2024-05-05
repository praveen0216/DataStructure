package tree;

import tree.DataUtil.TreeData;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfTreeTest {

    public static void main(String[] args) {
        TreeNode root = TreeData.getTree();
        //System.out.println("Size of a tree " +  getSizeOfTree(root));
        System.out.print("Size of a tree using recursion " +  sizeOfTree(root));
    }

    private static int sizeOfTree(TreeNode root) {
        if (root == null) return 0;
        return sizeOfTree(root.left) + sizeOfTree(root.right) + 1;

    }

    private static int getSizeOfTree(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode current;
        int count = 0;
        while (!q.isEmpty())  {
            current = q.poll();
            count++;
            if(current.left != null) {
                q.add(current.left);
            }
            if (current.right != null) {
                q.add(current.right);
            }
        }
        return count;
    }
}
