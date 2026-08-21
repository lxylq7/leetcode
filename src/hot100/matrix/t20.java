package hot100.matrix;
// t20 旋转图像
public class t20 {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        //先转置
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //行反转
        for (int[] row : matrix) {
            for (int i = 0; i < m /2; i++) {
                int temp = row[i];
                row[i] = row[m - 1 - i];
                row[m - 1 - i] = temp;
            }
        }
    }
}
