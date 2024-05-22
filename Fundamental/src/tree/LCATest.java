package tree;

import tree.DataUtil.TreeData;

import java.util.ArrayList;

/**
 *
 * LCA -> Lowest common ancestor
 *
 *
 */
public class LCATest {

    public static void main(String[] args) {

        TreeNode root = TreeData.getTree();
        TreeNode lca = getLca(root, 8, 15);
        System.out.print("LCA  " +  ((lca != null) ? lca.key: null));
    }

    private static TreeNode getLca(TreeNode root, int node1, int node2) {
        if (root == null) return null;
        ArrayList<TreeNode> path1 =  new ArrayList<>();
        ArrayList<TreeNode> path2 =  new ArrayList<>();
         if (!(findNode(root, path1, node1 ) && findNode(root, path2, node2))) {
             return null;
         }
         int min = Math.min(path1.size(), path2.size())-1;
         for( int i =0; i < min; i++) {
             if( path1.get(i+1) !=  path2.get(i+1)) {
                 return path1.get(i);
             }
         }
       return null;
    }

    private static boolean findNode(TreeNode root, ArrayList<TreeNode> path, int nodeTosearch) {
        if ( root ==  null ) return false;
        path.add(root);
        if (root.key == nodeTosearch) return true;
        if (findNode(root.left, path, nodeTosearch) || findNode(root.right, path,  nodeTosearch)) {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
}
