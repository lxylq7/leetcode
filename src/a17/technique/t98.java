package a17.technique;

public class t98 {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int p0 = 0,p1 = 0;
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            nums[i] = 2;
            if (x <= 1) {
                nums[p1++] = 1;
            }
            if (x == 0) {
                nums[p0++] = 0;
            }
        }
    }
}
