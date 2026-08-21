package hot100.binaryTree;

import java.util.ArrayList;
import java.util.List;
// 二叉树的右视图
public class t44 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(ans,0,root);
        return ans;
    }
    private void dfs(List<Integer> ans, int depth,TreeNode root) {
        if (root == null) {
            return;
        }
        if (depth == ans.size()) {
            ans.add(root.val);
        }
        dfs(ans,depth + 1,root.right);
        dfs(ans,depth + 1,root.left);
    }
}
