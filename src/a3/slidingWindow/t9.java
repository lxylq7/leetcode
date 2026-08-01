package a3.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class t9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String p = scanner.nextLine();
        List<Integer> ans = findAnagrams(s, p);
        System.out.println(ans);
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int[] ansp = new int[26];
        for (char c : p.toCharArray()) {
            ansp[c-'a']++;
        }
        List<Integer> ans = new ArrayList<>();
        int[] anss = new int[26];
        for (int right = 0; right < s.length(); right++) {
            anss[s.charAt(right)-'a']++;
            int left = right - p.length() + 1;
            if (left < 0) {
                continue;
            }
            if (Arrays.equals(ansp,anss)) {
                ans.add(left);
            }
            anss[s.charAt(left)-'a']--;
        }
        return ans;
    }
}
