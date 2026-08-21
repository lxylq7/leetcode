package hot100.back;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t62 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        // queens[r]=c 第r行的皇后放在第c列
        int[] queens = new int[n];
        boolean[] col = new boolean[n]; // 列
        // r+c 从0到2n-2 (n-1 + n -1)
        boolean[] diag1 = new boolean[n * 2 - 1];
        boolean[] diag2 = new boolean[n * 2 - 1];
        dfs(0,queens,col,diag1,diag2,ans);
        return ans;
    }
    private void dfs(int r,int[] queens,boolean[] col,boolean[] diag1,boolean[] diag2,List<List<String>> ans    ) {
        int n = col.length;
        // 递归终止条件
        if (r == n) {
            List<String> board = new ArrayList<>(n);
            //遍历每一行r queens[r]是该皇后所在的列
            for (int c : queens) {
                char[] row = new char[n];
                Arrays.fill(row,'.');
                row[c] = 'Q';
                board.add(String.valueOf(row));
            }
            ans.add(board);
            return;
        }
        // 尝试在当前第r行的每一列c摆放皇后
        for (int c = 0; c < n; c++) {
            //r-c可能为负数
            int rc = r - c + n - 1;
            if (!col[c] && !diag1[r + c] && !diag2[rc]) {
                // 递归
                queens[r] = c;
                col[c] = diag1[r + c] = diag2[rc] = true;
                //处理下一行
                dfs(r+1,queens,col,diag1,diag2,ans);
                //回溯
                col[c] = diag1[r + c] = diag2[rc] = false;
            }
        }
    }
}
