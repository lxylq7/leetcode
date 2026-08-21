package hot100.subString;

import java.util.ArrayDeque;

//滑动窗口最大值
public class t11 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        ArrayDeque<Integer> q = new ArrayDeque<Integer>();
        for (int i = 0; i < n; i++) {
            //右边进入
            while (!q.isEmpty() && nums[q.getLast()] <= nums[i]) {
                q.removeLast();
            }
            q.addLast(i);
            //左边出
            int left = i - k + 1; //窗口左端点
            if (q.getFirst() < left) {
                q.removeFirst();
            }
            if (left >= 0) {
                ans[left] = nums[q.getFirst()];
            }
        }
        return ans;
    }
}
