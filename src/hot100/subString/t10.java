package hot100.subString;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 和为k的子数组
public class t10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int count = subarraySum(nums, k);
        System.out.println(count);

    }
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        // 0出现的次数
        map.put(0,1);
        for (int num : nums) {
            sum += num;
            count += map.getOrDefault(sum-k,0);
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
