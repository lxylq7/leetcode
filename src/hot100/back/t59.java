package hot100.back;

import java.util.ArrayList;
import java.util.List;
// 生成括号
public class t59 {
    class Solution {
        public List<String> generateParenthesis(int n) {
            int m = 2 * n;
            List<String> ans = new ArrayList<>();
            char[] path = new char[n * 2];
            dfs(0,0,n,ans,path);
            return ans;
        }
        // i括号个数 左括号个数为 j 右括号个数为i-j
        private void dfs(int i,int j,int n,List<String> ans,char[] path){
            if (i == 2 * n) {
                ans.add(new String(path));
                return;
            }
            if (i < n) {
                //可以添加左括号
                path[i] = '(';
                dfs(i+1,j+1,n,ans,path);
            }
            if (i < 2 * j) {
                //可以添加右括号
                path[i] = ')';
                dfs(i+1,j,n,ans,path);
            }
        }
    }
}
