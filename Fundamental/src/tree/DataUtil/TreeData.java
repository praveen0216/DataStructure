package tree.DataUtil;

import tree.LevelOrderTraversalTest;
import tree.TreeNode;

public class TreeData {
    /**
     *          10
     *      20      30
     *    8    7       6
     *        9  15
     *
     */
    public static TreeNode getTree() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.right = new TreeNode(6);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(7);
        root.left.right.right = new TreeNode(15);
        root.left.right.left = new TreeNode(9);
        return root;
    }


    /**
     *
     *              20
     *          8         12
     *      3      5
     *
     *
     */
    public static TreeNode getChildrenSumTree() {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        return root;
    }


    /**
     *
     *              18
     *          8         12
     *                 13    70
     *
     *
     */
    public static TreeNode getBalancedHeightTree() {
        TreeNode root = new TreeNode(18);
        root.left = new TreeNode(8);
        root.right = new TreeNode(12);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(70);
        return root;
    }

    /**
     *
     *                            8
     *                   30               20
     *             90         10       50        60
     *          1     2    3     4   5    6    7    8
     *
     * preOrder : 8 30 90 1 2
     */
    public static TreeNode getBigTree() {
        TreeNode root = new TreeNode(8);

        root.left = new TreeNode(30);
        root.right = new TreeNode(20);

        root.left.left = new TreeNode(90);
        root.left.right = new TreeNode(10);
        root.right.left = new TreeNode(50);
        root.right.right = new TreeNode(60);

        root.left.left.left = new TreeNode(1);
        root.left.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(4);
        root.right.left.left = new TreeNode(5);
        root.right.left.right = new TreeNode(6);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        return root;
    }

    public static TreeNode getNullTree() {
        return null;
    }

    public static TreeNode getOneNodeTree() {
        return new TreeNode(8);
    }

/**
 *
 *                            1
 *                   2               3
 *
 *  inorder : 2 1 3
 *  preorder : 1 2 3
 **/
    public static TreeNode getThreeNodeTree() {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        return root;
    }

    /**
     *                10
     *            20       60
     *         30     80
     *      40    50       90
     *   60                    18
     *
     */

    public static TreeNode getDiameterTree() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(60);
        root.left.left = new TreeNode(30);
        root.left.right = new TreeNode(80);
        root.left.right.right = new TreeNode(90);
        root.left.right.right.right = new TreeNode(18);
        root.left.left.left = new TreeNode(40);
        root.left.left.right =  new TreeNode(50);
        root.left.left.left.left = new TreeNode(60);
        return root;
    }


    /**
     *                   1
     *           2              3
     *       4       5       6      7
     *    8    9   10  11  12  13
     *
     * @return root
     */


    public static TreeNode getCompleteBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);

        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);


        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(13);
        return root;
    }
}
