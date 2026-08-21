package hot100.ordinaryArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//合并区间
public class t14 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        for (int[] p : intervals)  {
            int m = res.size();
            if (m > 0 && p[0] <= res.get(m-1)[1]) {
                res.get(m-1)[1] = Math.max(p[1],res.get(m-1)[1]);
            } else {
                res.add(p);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
