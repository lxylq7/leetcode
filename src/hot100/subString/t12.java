package hot100.subString;

//最小覆盖字串
public class t12 {
    public String minWindow(String s, String t) {
        int[] cntt = new int[128];
        int[] cnts = new int[128];
        for (char c: t.toCharArray()) {
            cntt[c]++;
        }
        int len = s.length();
        int left = 0;
        int ansLeft = 0;
        int ansRight = len;
        for (int right = 0; right < len; right++) {
            cnts[s.charAt(right)]++;
            while (isCover(cntt, cnts)) {
                if (right - left < ansRight - ansLeft)  {
                    ansLeft = left;
                    ansRight = right;
                }
                cnts[s.charAt(left)]--;
                left++;
            }
        }
        return ansRight == len ? "" : s.substring(ansLeft, ansRight+1);
    }
    public boolean isCover(int[] cntt, int[] cnts) {
        for (int i = 'A'; i <= 'Z'; i++) {
            if (cntt[i] > cnts[i]) {
                return false;
            }
        }
        for (int i = 'a'; i <= 'z'; i++) {
            if (cntt[i] > cnts[i]) {
                return false;
            }
        }
        return true;
    }
}
