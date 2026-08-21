package hot100.multidp;

public class t94 {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] s = text1.toCharArray();
        char[] t = text2.toCharArray();
        int m = s.length;
        int n = t.length;
        int[][] f = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                f[i+1][j+1] = s[i] == t[j] ? f[i][j] + 1
                        : Math.max(f[i][j+1],f[i+1][j]);
            }
        }
        return f[m][n];
    }
}
