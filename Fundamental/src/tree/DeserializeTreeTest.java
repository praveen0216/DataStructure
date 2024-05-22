package tree;

import tree.DataUtil.TreeData;

import java.util.List;

public class DeserializeTreeTest {

    static Integer EMPTY = -1;
    static int index = 0;
    public static void main(String[] args) {
        TreeNode root = TreeData.getThreeNodeTree();
        List<Integer> arr = SerializeTreeTest.serializeTree(root);

        TreeNode newRoot = deserializeTree(arr);
        preOrderTraversal(newRoot);

    }

    private static TreeNode deserializeTree(List<Integer> l) {
        if(index == l.size()) return null;
        int value = l.get(index);
        index++;
        if (value == EMPTY) return null;
        TreeNode root = new TreeNode(value);
        root.left = deserializeTree(l);
        root.right = deserializeTree(l);
        return root;
    }

    private static void preOrderTraversal(TreeNode root) {
        if (root == null) return;
        System.out.print(root.key + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
}
