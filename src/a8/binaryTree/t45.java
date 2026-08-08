package a8.binaryTree;
// 二叉树展开为链表
public class t45 {
    TreeNode head;
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.left = null;
        root.right = head;
        head = root;
    }
}
