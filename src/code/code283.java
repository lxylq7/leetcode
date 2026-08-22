package code;

public class code283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return;
        }
        int left = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                swap(nums,left,i);
                left++;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
