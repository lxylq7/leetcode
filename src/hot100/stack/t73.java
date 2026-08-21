package hot100.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class t73 {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Deque<Integer> st = new ArrayDeque<>();
        st.push(-1);
        int ans = 0;
        for (int right = 0; right <= n; right++) {
            int h = right < n ? heights[right] : -1;
            while (st.size() > 1 && heights[st.peek()] >= h) {
                int i = st.pop();
                int left = st.peek();
                ans = Math.max(ans,heights[i] * (right - left - 1));
            }
            st.push(right);
        }
        return ans;
    }
}
