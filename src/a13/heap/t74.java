package a13.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class t74 {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }
        return quickSelect(numList,k);
    }
    private int quickSelect(List<Integer> nums,int k) {
        Random random = new Random();
        int p = nums.get(random.nextInt(nums.size()));
        List<Integer> big = new ArrayList<>();
        List<Integer> small = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        for (int num : nums) {
            if (num > p) {
                big.add(num);
            } else if (num < p) {
                small.add(num);
            } else {
                equal.add(num);
            }
        }
        if (k <= big.size()) {
            return quickSelect(big,k);
        }
        if (nums.size() - small.size() < k) {
            return quickSelect(small,k - nums.size() + small.size());
        }
        return p;
    }
}
