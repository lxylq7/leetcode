package a14.greedyAlgorithm;

public class t79 {
    public int jump(int[] nums) {
        int mx = 0;
        int count = 0;
        int end = 0;
        if (nums.length == 1) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            mx = Math.max(mx,i + nums[i]);
            //走到当前区域尽头 必须跳一次
            if (i == end) {
                count++;
                end = mx;
                if (mx >= nums.length-1) {
                    break;
                }
            }
        }
        return count;
    }
}
