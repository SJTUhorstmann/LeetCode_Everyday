class Solution {
    int n=0,m=0;
    boolean isVisited[][];
    char[][] board; String word;

    public boolean exist(char[][] _board, String _word) {
        board=_board;
        word=_word;
        n=board.length;
        m=board[0].length;
        isVisited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(word.charAt(0)==board[i][j]){
                    if(dfs(i,j,1)) return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(int x,int y,int u){
        if(u==word.length()) return true;
        isVisited[x][y]=true;
        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};
        for(int i=0;i<4;i++){
            int a=x+dx[i];
            int b=y+dy[i];
            if(a>=0&&a<n&&b>=0&&b<m&&!isVisited[a][b]&&board[a][b]==word.charAt(u)){
                if(dfs(a,b,u+1)) return true;
            }
        }
        isVisited[x][y]=false;
        return false;
        
    }
}