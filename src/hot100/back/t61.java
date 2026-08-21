package hot100.back;

import java.util.ArrayList;
import java.util.List;

public class t61 {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        dfs(0,0,s,path,ans);
        return ans;
    }
    private void dfs(int i,int start,String s,List<String> path,List<List<String>> ans) {
        if (i == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }
        //不分割
        if (i < s.length() - 1) { //可以不分割
            dfs(i+1,start,s,path,ans);
        }
        //分割 得到字串start i
        if (isPalindrome(s,start,i)) {
            path.add(s.substring(start,i+1));
            dfs(i+1,i+1,s,path,ans);
            path.remove(path.size()-1);
        }

    }
    private boolean isPalindrome(String s,int left,int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
