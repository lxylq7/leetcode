package hot100.dp;

import java.util.ArrayList;
import java.util.List;

public class t82 {
    public List<List<Integer>> generate(int nums) {
        List<List<Integer>> ans = new ArrayList<>(nums);
        ans.add(List.of(1));
        for (int i = 1; i < nums; i++) {
            List<Integer> c = new ArrayList<>(i+1);
            c.add(1);
            for (int j = 1; j < i; j++) {
                c.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            c.add(1);
            ans.add(c);
        }
        return ans;
    }
}
