package hot100.back;

import java.util.ArrayList;
import java.util.List;

public class t58 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(candidates, target, 0, path, ans);
        return ans;
    }
    private void dfs(int[] candidates, int target, int i, List<Integer> path, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }
        if (target < 0 || i == candidates.length) {
            return;
        }
        //不选
        dfs(candidates,target,i+1,path,ans);
        //选
        path.add(candidates[i]);
        dfs(candidates,target-candidates[i],i,path,ans);
        path.remove(path.size()-1);
    }

}
