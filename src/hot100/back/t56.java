package hot100.back;

import java.util.ArrayList;
import java.util.List;
// 子集
public class t56 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(0,nums,ans,path);
        return ans;
    }
    private void dfs(int i,int[] nums,List<List<Integer>> ans,List<Integer> path) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        //不选
        dfs(i + 1,nums,ans,path);
        //选
        path.add(nums[i]);
        dfs(i + 1,nums,ans,path);
        path.remove(path.size() - 1);
    }
}
