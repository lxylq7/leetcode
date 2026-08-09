package a8.binaryTree;

import java.util.HashMap;
import java.util.Map;

public class t48 {
    private int ans;
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long,Integer> cnt = new HashMap<>();
        cnt.put(0L,1);
        dfs(root,0,targetSum,cnt);
        return ans;
    }
    // s 表示从根到node的父节点的路径和
    private void dfs(TreeNode node, long s, int targetSum, Map<Long,Integer> cnt) {
        if (node == null) {
            return;
        }
        s += node.val;
        ans += cnt.getOrDefault(s-targetSum,0);
        cnt.merge(s,1,Integer::sum);
        dfs(node.left,s,targetSum,cnt);
        dfs(node.right,s,targetSum,cnt);
        cnt.merge(s,-1,Integer::sum);
    }
}
