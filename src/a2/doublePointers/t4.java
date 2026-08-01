package a2.doublePointers;
// 移动零
public class t4 {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return;
        }
        int left = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                //交换
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
