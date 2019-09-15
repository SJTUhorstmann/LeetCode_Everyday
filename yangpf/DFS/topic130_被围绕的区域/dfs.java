class Solution {
    public void solve(char[][] board) {
        if(board==null || board.length==0)  return;
        int m=board.length;
        int n=board[0].length;
        boolean[][] flag=new boolean[m][n];
        for(int i=0;i<n;i++){
            if(board[0][i]=='O'){
                dfs(board,0,i,flag);
            }
            if(board[m-1][i]=='O'){
                dfs(board,m-1,i,flag);
            }
        }
        for(int i=0;i<m;i++){
            if(board[i][0]=='O'){
                dfs(board,i,0,flag);
            }
            if(board[i][n-1]=='O'){
                dfs(board,i,n-1,flag);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(flag[i][j]==false){
                    board[i][j]='X';
                }
            }
        }
    }
    public void dfs(char[][] board,int i,int j,boolean[][] flag){
        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]=='X'||flag[i][j]==true){
            return;
        }
        flag[i][j]=true;
        dfs(board,i+1,j,flag);
        dfs(board,i-1,j,flag);
        dfs(board,i,j+1,flag);
        dfs(board,i,j-1,flag);
    }
}