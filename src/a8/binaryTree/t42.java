package a8.binaryTree;

import java.util.ArrayList;
import java.util.List;
// 验证二叉搜索树
// 中序遍历一定是有序的
public class t42 {
    public boolean isValidBST(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(ans,root);
        for (int i = 1; i < ans.size(); i++) {
            if (ans.get(i) <= ans.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
    private void dfs(List<Integer> ans,TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(ans,root.left);
        ans.add(root.val);
        dfs(ans,root.right);
    }
}
