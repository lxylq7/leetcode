package a11.binarySearch;
// 在排序数组中查找元素的第一个和最后一个位置
public class t65 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1,-1};
        }
        int begin = binarySearch(nums,target);
        if (begin == nums.length || nums[begin] != target) {
            return new int[]{-1,-1};
        }
        int end = binarySearch(nums,target+1);
        return new int[]{begin,end-1};
    }
    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
