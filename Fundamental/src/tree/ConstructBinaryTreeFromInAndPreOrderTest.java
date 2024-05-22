package tree;



public class ConstructBinaryTreeFromInAndPreOrderTest {

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return buildTreeHelper(preorder, 0, preorder.length - 1,
                    inorder, 0, inorder.length - 1);
        }

        private TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd,
                                         int[] inorder, int inStart, int inEnd) {
            if (preStart > preEnd || inStart > inEnd) {
                return null;
            }

            int rootValue = preorder[preStart];
            TreeNode root = new TreeNode(rootValue);

            int rootIndex = 0;
            for (int i = inStart; i <= inEnd; i++) {
                if (inorder[i] == rootValue) {
                    rootIndex = i;
                    break;
                }
            }

            int leftSubtreeSize = rootIndex - inStart;

            root.left = buildTreeHelper(preorder, preStart + 1, preStart + leftSubtreeSize,
                    inorder, inStart, rootIndex - 1);

            root.right = buildTreeHelper(preorder, preStart + leftSubtreeSize + 1, preEnd,
                    inorder, rootIndex + 1, inEnd);

            return root;
        }

        // Function to print the tree (in-order traversal)
        public void printInOrder(TreeNode node) {
            if (node == null) {
                return;
            }
            printInOrder(node.left);
            System.out.print(node.key + " ");
            printInOrder(node.right);
        }

        public static void main(String[] args) {
            ConstructBinaryTreeFromInAndPreOrderTest b = new ConstructBinaryTreeFromInAndPreOrderTest();
            int[] inorder = {20,10, 40, 30, 50};
            int[] preorder = {10, 20, 30, 40, 50};

            TreeNode root = b.buildTree(preorder, inorder);
            System.out.println("Inorder traversal of constructed tree:");
            b.printInOrder(root);
        }
    }

