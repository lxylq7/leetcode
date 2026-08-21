package hot100.binaryTree;

import java.util.ArrayList;
import java.util.List;
// 二叉树的中序遍历
public class t35 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(ans,root);
        return ans;
    }
    private void dfs(List<Integer> ans,TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(ans,node.left);
        ans.add(node.val);
        dfs(ans,node.right);
    }
}
