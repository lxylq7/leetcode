package hot100.ordinaryArray;

import java.util.Arrays;
import java.util.Scanner;

//轮转数组
public class t15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = scanner.nextInt();
        }
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums,0,k);
        reverse(nums,k+14,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    public static void reverse(int[] nums,int left,int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
