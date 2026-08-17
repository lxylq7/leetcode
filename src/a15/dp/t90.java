package a15.dp;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class t90 {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int ans = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left < right) {
                left = right = 0;
            } else if (left == right) {
                ans = Math.max(ans,right * 2);
            }
        }
        right = left = 0;
        for (int i = n-1; i >= 0; i--) {
            if (s.charAt(i) == ')') {
                left++;
            } else {
                right++;
            }
            if (left < right) {
                left = right = 0;
            } else if (left == right) {
                ans = Math.max(ans,right * 2);
            }
        }
        return ans;
    }

}
