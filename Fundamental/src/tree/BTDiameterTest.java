package tree;

import tree.DataUtil.TreeData;

public class BTDiameterTest {

    private static int MAX = Integer.MIN_VALUE;
    public static void main(String[] args) {
        TreeNode root = TreeData.getTree();
        System.out.print("Diameter of BT is " + diameter(root));
    }


    private static int height(TreeNode root) {
        if(root == null ) return 0;
        return Math.max(height(root.left), height(root.right) + 1);
    }


    private static int getMaxDiameter(TreeNode root) {
        if (root == null) return 0;
        //for root -> 1
        int d = height(root.left) + height(root.right) + 1;
        int d1 = getMaxDiameter(root.left);
        int d2 = getMaxDiameter(root.right);
        return Math.max(d, Math.max(d1, d2));
    }


    // O(n) solution
    private static int diameter(TreeNode root) {
        if (root ==  null) return 0;
        int lh = diameter(root.left) ;
        int rh =  diameter(root.right);
        MAX = Math.max(MAX, Math.max(lh, rh) +1);
        return MAX;
    }
}
