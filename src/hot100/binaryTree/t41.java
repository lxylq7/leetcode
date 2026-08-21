package hot100.binaryTree;
// 将有序数组转换为二叉搜索树
public class t41 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums,0,nums.length - 1);
    }
    private TreeNode dfs(int[] nums,int l,int r) {
        if (l > r) {
            return null;
        }
        int mid = l + ( r - l ) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = dfs(nums,l,mid - 1);
        node.right = dfs(nums,mid + 1,r);
        return node;
    }
}
