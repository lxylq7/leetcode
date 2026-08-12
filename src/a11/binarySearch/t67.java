package a11.binarySearch;

public class t67 {
    public int findMin(int[] nums) {
         int left = 0;
         int right = nums.length - 1;
         while (left <= right) {
             int mid = left + (right - left) / 2;
             if (nums[mid] <= nums[nums.length-1]) {
                 right = mid - 1;
             } else {
                 left = mid + 1;
             }
         }
         return nums[left];
    }
}
