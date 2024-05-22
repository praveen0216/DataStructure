package tree;

import com.sun.source.tree.Tree;
import tree.DataUtil.TreeData;

public class CountCompleteBTNodesTest {

    static int count = 0;

    public static void main(String[] args) {
        TreeNode root = TreeData.getChildrenSumTree(); // This is a complete  Binary tree
        System.out.println("Count of a binary tree : " + getNumOfNodes(root));
        System.out.println("Count of a binary tree : " + countNodes(root));

        root = TreeData.getCompleteBinaryTree() ;
        System.out.println("Count of a complete binary tree : " + countNodesEfficient(root));

    }

    private static int getNumOfNodes(TreeNode root) {
        if (root == null ) return 0;
        count = count + 1 ;
        getNumOfNodes(root.left);
        getNumOfNodes(root.right);
        return count;
    }

    private static int countNodes(TreeNode root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    //O(logn * logn) solution (Efficient)
    // Assumption that a tree is a complete binary tree
    private static int countNodesEfficient(TreeNode root) {
        if (root == null ) return 0;
        int lh = 0,  rh  = 0;

        TreeNode curr = root;

        //height of left screw tree means all the left nodes
        while(curr != null) {
            lh++;
            curr = curr.left;
        }
        curr = root;
        //height of right screw tree means all the right nodes
        while(curr != null) {
            lh++;
            curr = curr.right;
        }

        if ( lh == rh) {
            return (int) (Math.pow(2,lh) - 1);
        } else {
            return 1 + countNodesEfficient(root.left) + countNodesEfficient(root.right);
        }
    }
}
