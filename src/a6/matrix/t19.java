package a6.matrix;

import java.util.ArrayList;
import java.util.List;

public class t19 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> arr = new ArrayList<>(m * n);
        int i = 0;
        int j = 0;
        int d = 0;
        for (int k = 0; k < m * n; k++) {
            arr.add(matrix[i][j]);
            //已经访问过标记
            matrix[i][j] = Integer.MAX_VALUE;
            int x = i + binary[d][0];
            int y = j + binary[d][1];
            //判断x y出界 已经访问过 换方向
            if (x < 0  || x >= m || y < 0  || y >= n ||matrix[x][y] == Integer.MAX_VALUE ) {
                d = (d + 1) % 4;
            }
            i += binary[d][0];
            j += binary[d][1];
        }
        return arr;
    }
    private static final int[][] binary = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

}
