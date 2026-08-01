package a1.hash;

import java.util.HashSet;

// 最长连续序列
public class t3 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        int max = 0;
        for (int num : hashSet) {
            //直接跳过不是最小的数
            if (!hashSet.contains(num-1)) {
                int currentNum = num;
                int currentMax = 1;
                while (hashSet.contains(currentNum+1)) {
                    currentNum++;
                    currentMax++;
                }
                max = Math.max(max,currentMax);
            }
        }
        return max;
    }
}
