package hot100.matrix;
// 搜索二维矩阵2
public class t21 {
    public boolean searchMatrix(int[][] matrix, int target) {
        //从右上角开始
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
