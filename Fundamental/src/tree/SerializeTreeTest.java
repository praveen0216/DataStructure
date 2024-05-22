package tree;

import tree.DataUtil.TreeData;

import java.util.ArrayList;
import java.util.List;

public class SerializeTreeTest {

    public static void main(String[] args) {
        TreeNode root = TreeData.getThreeNodeTree();
        System.out.println(serializeTree(root));

        root = TreeData.getBigTree();
        System.out.println(serializeTree(root));

    }

    public static List<Integer> serializeTree(TreeNode root) {
        List<Integer> arr =  new ArrayList<>();
        preOrderTraversal(root, arr);
        return arr;
    }

    private static void preOrderTraversal(TreeNode root, List<Integer> arr) {
        if (root == null) {
            arr.add(-1);
            return;
        }
        arr.add(root.key);
        preOrderTraversal(root.left, arr);
        preOrderTraversal(root.right, arr);
    }
}
