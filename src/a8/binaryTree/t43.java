package a8.binaryTree;

import java.util.ArrayList;
import java.util.List;
// 二叉搜索树中的第K小的元素
public class t43 {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        dfs(ans,root);
        return ans.get(k - 1);
    }

    private void dfs(List<Integer> ans, TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(ans,root.left);
        ans.add(root.val);
        dfs(ans,root.right);
    }
}
