package hot100.back;

public class t60{
    private static final int[][] DIRS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public boolean exist(char[][] board, String word) {
        char[] c = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dfs(i,j,0,board,c))  {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(int i,int j,int k,char[][] board,char[] word) {
        if (board[i][j] != word[k])  {
            return false;
        }
        if (k == word.length-1){
            return true;
        }
        board[i][j] = 0; //标记访问过
        for (int[] d : DIRS) {
            int x = i + d[0];
            int y = j + d[1];
            if (x >= 0 && x < board.length && y >= 0 && y < board[x].length && board[x][y] != 0 && dfs(x,y,k+1,board,word)) {
                return true;
            }
        }
        board[i][j] = word[k]; //回溯
        return false;
    }
}
