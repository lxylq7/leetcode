package hot100.back;

import java.util.ArrayList;
import java.util.List;

// 全排列
public class t55 {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        boolean[] onPath = new boolean[n];
        List<Integer> path = new ArrayList<>();
        dfs(0,nums,res,onPath,path);
        return res;

    }
    private void dfs(int i,int[] nums,List<List<Integer>> res,boolean[] onPath,List<Integer> path) {
        if (i == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            if (!onPath[j]) {
                onPath[j] = true;
                path.add(nums[j]);
                dfs(i + 1,nums,res,onPath,path);
                path.remove(path.size() - 1);
                onPath[j] = false;
            }
        }
    }
}
