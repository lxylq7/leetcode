package hot100.doublePointers;

import java.util.Scanner;

// 接雨水
public class t7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int result = trap(nums);
        System.out.println(result);
    }
    public static int trap(int[] height) {
        int len = height.length;
        int left = 0,ans = 0,leftMax = 0,rightMax = 0;
        int right = len - 1;
        while (left < right){
            leftMax = Math.max(leftMax,height[left]);
            rightMax = Math.max(rightMax,height[right]);
            if (leftMax < rightMax) {
                ans += leftMax - height[left];
                left++;
            } else {
                ans += rightMax - height[right];
                right--;
            }
        }
        return ans;
    }
}
