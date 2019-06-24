class Solution {
    public boolean isValidSudoku(char[][] board) {
       for(int i=0;i<9;i++) {
            Set<Character> row = new HashSet<Character>();
            Set<Character> col = new HashSet<Character>();
            Set<Character> block = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                //��i��
                if (board[i][j]!='.'&&!row.add(board[i][j])) return false;
                //��i��
                if (board[j][i]!='.'&&!col.add(board[j][i])) return false;
                //block�����궨��
                int br=3 * (i / 3) + j / 3;
                int bc=3 * (i % 3) + j % 3;
                if(board[br][bc]!='.'&&!block.add(board[br][bc])) return false;

            }
        }
        return true;
        
    }
}