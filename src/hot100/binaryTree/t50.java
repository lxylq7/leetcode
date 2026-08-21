package hot100.binaryTree;

public class t50 {
    private int ans = Integer.MIN_VALUE;;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return ans;
    }
    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        ans = Math.max(ans,left + right + root.val);
        return Math.max(Math.max(left,right) + root.val,0);
    }
}
