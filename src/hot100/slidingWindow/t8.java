package hot100.slidingWindow;

import java.util.Scanner;

// 无重复字符的最长子串
public class t8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int result = lengthOfLongestSubstring(str);
        System.out.println(result);
    }
    public static int lengthOfLongestSubstring(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int ans = 0,left = 0;
        int[] cnt = new int[128];
        for (int right = 0; right < length; right++) {
            char c = charArray[right];
            cnt[c]++;
            while (cnt[c] > 1) {
                cnt[charArray[left]]--;
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
