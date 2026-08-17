package a15.dp;

public class t89 {
    public boolean canPartition(int[] nums) {
        int s = 0;
        for (int x : nums) {
            s += x;
        }
        if (s % 2 != 0) {
            return false;
        }
        s /= 2;
        int n = nums.length;
        boolean[][] f = new boolean[n+1][s+1];
        f[0][0] = true;
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            for (int j = 0; j <= s; j++) {
                f[i+1][j] = (j >= x && f[i][j-x]) || f[i][j];
            }
        }
        return f[n][s];
    }
}
