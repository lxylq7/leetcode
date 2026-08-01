package a2.doublePointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//三数之和
public class t6 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            int x = nums[i];
            if (i > 0 && x == nums[i-1]) continue;
            if (x + nums[i+1] + nums[i+2] > 0) break;
            if (x + nums[len-1] + nums[len-2] < 0) continue;
            int j = i + 1;
            int k = len - 1;
            while (j < k){
                int s = x + nums[j] + nums[k];
                if (s > 0) k--;
                if (s < 0) j++;
                if (s == 0) {
                    list.add(Arrays.asList(x,nums[j],nums[k]));
                    //跳过重复的数
                    for (j++; j < k && nums[j] == nums[j - 1]; j++);
                    for (k--; j < k && nums[k] == nums[k + 1]; k--);

                }
            }
        }
        return list;
    }
}
