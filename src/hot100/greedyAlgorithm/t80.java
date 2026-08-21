package hot100.greedyAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class t80 {
    public List<Integer> partitionLabels(String s) {
        int[] arr = new int[26];
        int len = s.length();
        // 结束下标
        for (int i = 0; i < len; i++) {
            arr[s.charAt(i) - 'a'] = i;
        }
        int start = 0;
        int end = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            end = Math.max(end,arr[s.charAt(i) - 'a']);
            if (i == end) {
                ans.add(end - start + 1);
                start = end + 1;
            }
        }
        return ans;
    }
}
