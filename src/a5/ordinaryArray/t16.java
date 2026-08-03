package a5.ordinaryArray;

//
public class t16 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int p = 1;
        int index = -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
                index = i;
                continue;
            }
            p *= nums[i];
        }
        if (count > 1) { //全是0
            return res;
        }
        if (count == 1)  {
            res[index] = p;
            return res;
        } else { //没有0
            for (int i = 0; i < nums.length; i++) {
                res[i] = p / nums[i];
            }
        }
        return res;
    }
}
