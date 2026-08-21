package hot100.binaryTree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * 获取
     * @return val
     */
    public int getVal() {
        return val;
    }

    /**
     * 设置
     * @param val
     */
    public void setVal(int val) {
        this.val = val;
    }

    /**
     * 获取
     * @return left
     */
    public TreeNode getLeft() {
        return left;
    }

    /**
     * 设置
     * @param left
     */
    public void setLeft(TreeNode left) {
        this.left = left;
    }

    /**
     * 获取
     * @return right
     */
    public TreeNode getRight() {
        return right;
    }

    /**
     * 设置
     * @param right
     */
    public void setRight(TreeNode right) {
        this.right = right;
    }

    public String toString() {
        return "TreeNode{val = " + val + ", left = " + left + ", right = " + right + "}";
    }
}
