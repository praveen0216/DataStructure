package tree;

import tree.DataUtil.TreeData;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversalSpiralTest {

    public static void main(String[] args) {
        TreeNode root = TreeData.getTree();
        printInSpiral(root);
        printInSpiralWithTwoStack(root);

    }

    /**
     *          10
     *      20      30
     *    8    7       6
     *        9  15
     *
     * o/p 10 30 20 8 7 6 15 9
     *
     */

    private static void printInSpiral(TreeNode root) {
        if (root == null) return ;

        Queue<TreeNode> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        boolean reverse = false;
        q.add(root);
        int size = 0;
        while(!q.isEmpty()) {
            size = q.size();

            while(size > 0) {
                TreeNode current = q.poll();
                if(reverse) {
                    s.push(current.key);
                } else  {
                    System.out.print(current.key + " ");
                }
                if (current.left != null) q.add(current.left);
                if (current.right != null) q.add(current.right);
            size -- ;
            }
            if (reverse) {
                while (!s.isEmpty()) {
                    System.out.print( s.pop() + " ");
                }
            }
            reverse = !reverse;
        }
    }

    /**
     *          10
     *      20      30
     *    8    7       6
     *        9  15
     *
     * o/p 10 30 20 8 7 6 15 9
     *
     */

    private static void printInSpiralWithTwoStack(TreeNode root) {
        if(root == null) return;

        Stack<TreeNode> s1 = new Stack<>(); // should use R to L push
        Stack<TreeNode> s2 = new Stack<>(); // should use L to R push
        s1.push(root);
        TreeNode temp;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                temp =  s1.pop();
                System.out.print( temp.key + " ");
                if (temp.left != null) s2.push(temp.left);
                if (temp.right != null) s2.push(temp.right);
            }
            while (!s2.isEmpty()) {
                temp =  s2.pop();
                System.out.print( temp.key + " ");
                if (temp.right != null) s1.push(temp.right);
                if (temp.left != null) s1.push(temp.left);
            }
        }
    }
}
