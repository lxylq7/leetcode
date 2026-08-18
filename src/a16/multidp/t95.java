package a16.multidp;

public class t95 {
    public int minDistance(String word1, String word2) {
        char[] s = word1.toCharArray();
        char[] t = word2.toCharArray();
        int n = s.length;
        int m = t.length;
        int[][] f = new int[n + 1][m + 1];
        for (int i = 0; i < m; i++) {
            f[0][i+1] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            f[i+1][0] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                f[i+1][j+1] = s[i] == t[j] ? f[i][j] :
                        Math.min(Math.min(f[i][j+1],f[i+1][j]),f[i][j]) + 1;

            }
        }
        return f[n][m];
    }
}
