package a8.binaryTree;
// 二叉树的最大深度
public class t36 {
    public int maxDepth(TreeNode root) {
        if (root == null)  {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.max(l,r) + 1;
    }
}
