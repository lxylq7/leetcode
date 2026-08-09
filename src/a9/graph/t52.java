package a9.graph;

import java.util.ArrayList;
import java.util.List;

public class t52 {
    private static final int[][] q = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        List<int[]> arr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                } else if (grid[i][j] == 2) {
                    arr.add(new int[]{i, j});
                }
            }
        }
        int ans = 0;
        while (fresh > 0 && !arr.isEmpty()) {
            ans++;
            List<int[]> tmp = arr;
            arr = new ArrayList<>();
            for (int[] pos : tmp) {
                for (int[] d : q) {
                    int i = pos[0] + d[0];
                    int j = pos[1] + d[1];
                    if (i >= 0 && i < m && j >= 0 && j < m && grid[i][j] == 1) {
                        fresh--;
                        grid[i][j] = 2;
                        arr.add(new int[]{i, j});
                    }
                }
            }
        }
        return fresh > 0 ? -1 : ans;
    }
}
