class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] squares = new boolean[9][9];
        for (int i = 0; i < board.length; i++) {
          for (int j = 0; j < board[i].length; j++) {
            if (board[i][j] == '.') {
              continue;
            }
            int num = board[i][j] - '1';
            if (rows[i][num]) {
              return false;
            }
            rows[i][num] = true;
            if (columns[j][num]) {
              return false;
            }
            columns[j][num] = true;
            if (squares[(i / 3) * 3 + j / 3][num]) {
              return false;
            }
            squares[(i / 3) * 3 + j / 3][num] = true;
          }
        }
        return true;
    }
}