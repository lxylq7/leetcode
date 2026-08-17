package a15.dp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class t86 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int k = 0; k < i; k++) {
                if (dp[k] && wordDictSet.contains(s.substring(k,i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
