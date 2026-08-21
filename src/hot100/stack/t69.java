package hot100.stack;

import java.util.ArrayDeque;
import java.util.Deque;
// 有效的括号
public class t69 {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Deque<Object> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(')');
            } else if (c =='[') {
                st.push(']');
            } else if (c == '{') {
                st.push('}');
            } else if (st.isEmpty() || !st.pop().equals(c)) {
                return false;
            }
        }
        return st.isEmpty() ? true : false;
    }
}
