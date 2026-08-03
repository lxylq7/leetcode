package a5.ordinaryArray;

// 最大子数组和
public class t13 {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int minPresum = 0;
        int preSum = 0;
        for (int num : nums) {
            preSum += num;
            ans = Math.max(ans, preSum - minPresum);
            minPresum = Math.min(minPresum, preSum);
        }
        return ans;
    }
}
