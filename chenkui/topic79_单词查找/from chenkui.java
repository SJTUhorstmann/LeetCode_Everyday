class Solution {
    public boolean exist(char[][] board, String word) {
        if (word == null || word.isEmpty())
            return true;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == word.charAt(0)) {
                    if (existUtil(board, row, col, word.toCharArray(),0, new boolean[board.length][board[0].length]))
                        return true;
                }
            }
        }
        return false;
    }

    private boolean existUtil(char[][] board, int row, int col, char[] word, int index,  boolean[][] isVisited) {
                            
        if (!isSafe(board, row, col, isVisited) || index >= word.length) {
            return false;
        }
        if (board[row][col] != word[index]) {
            return false;
        }
        isVisited[row][col] = true;
        if (index == word.length - 1) {
            return true;
        }

        boolean result = existUtil(board, row, col - 1, word, index + 1, isVisited) ||
                existUtil(board, row, col + 1, word, index + 1, isVisited) ||
                existUtil(board, row - 1, col, word, index + 1, isVisited) ||
                existUtil(board, row + 1, col, word, index + 1, isVisited);

        isVisited[row][col] = false;        
        return result;
    }
    private boolean isSafe(char[][] board, int row, int col, boolean[][] isVisited) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || isVisited[row][col])
            return false;
        return true;
    }
}