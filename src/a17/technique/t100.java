package a17.technique;

public class t100 {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (fast == slow) {
                 break;
            }
        }
        int head = 0;
        while (slow != head) {
            slow = nums[slow];
            head = nums[head];
        }
        return slow;
    }
}
