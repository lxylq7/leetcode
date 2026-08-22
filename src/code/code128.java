package code;

import java.util.HashSet;

public class code128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int num : set) {
            if (!set.contains(num-1)) {
                int curNum = num;
                int curMax = 1;
                while (set.contains(curNum+1)) {
                    curNum++;
                    curMax++;
                }
                max = Math.max(max, curMax);
            }
        }
        return max;
    }
}
