package hot100.technique;

public class t97 {
    public int majorityElement(int[] nums) {
        int ans = 0;
        int hp = 0;
        for (int x : nums) {
            if (hp == 0) {
                ans = x;
                hp = 1;
            } else {
                hp += x == ans ? 1 : -1;
            }
        }
        return ans;
    }
}
