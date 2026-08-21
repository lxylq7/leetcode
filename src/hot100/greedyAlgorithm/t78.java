package hot100.greedyAlgorithm;

public class t78 {
    public boolean canJump(int[] nums) {
        int mx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > mx) {
                return false;
            }
            mx = Math.max(mx,i + nums[i]);
        }
        return true;
    }
}
