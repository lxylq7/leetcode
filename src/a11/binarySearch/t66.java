package a11.binarySearch;
// 搜索旋转排序数组
public class t66 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // 左区间有序 等于号代表的是有一个元素的情况 左区间仍然有序 mid = left
            if (nums[mid] >= nums[left]) {
                //去左边找
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // 右区间有序
                //去右边找
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return left < nums.length && nums[left] == target ? left : -1;
    }

}
