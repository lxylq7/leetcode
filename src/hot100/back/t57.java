package hot100.back;

import java.util.ArrayList;
import java.util.List;

// 电话号码的字母组合
public class t57 {
    private static final String[] MAPPING = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0 || digits == null) {
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>();
        int n = digits.length();
        char[] arr = new char[n];
        dfs(0,digits,arr,ans);
        return ans;
    }
    private void dfs(int i,String digits,char[] arr,List<String> ans) {
        if (i == digits.length()) {
            ans.add(new String(arr));
            return;
        }
        String str = MAPPING[digits.charAt(i) - '0'];
        for (char c : str.toCharArray()) {
            //直接覆盖
            arr[i] = c;
            dfs(i + 1,digits,arr,ans);
        }
    }
}
