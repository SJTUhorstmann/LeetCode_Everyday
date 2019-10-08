//超时解法  85/87    加上关键一行代码通过
class Solution {
    int[] dx=new int[]{1,0,-1,0};
    int[] dy=new int[]{0,1,0,-1};
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean flag=false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                flag|=dfs(board,i,j,word,0);
                if(flag)    return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,int i,int j,String word,int index){
        if(board[i][j]!=word.charAt(index)) return false;
        if(index+1==word.length())  return true;
        char cur=board[i][j];
        boolean flag=false;
        for(int k=0;k<4;k++){
            int tx=i+dx[k];
            int ty=j+dy[k];
            if(tx>=0&&tx<board.length&&ty>=0&&ty<board[0].length&&
               board[tx][ty]==word.charAt(index+1)){
                board[i][j]='-';
                flag|=dfs(board,tx,ty,word,index+1);
                board[i][j]=cur;
	//加上下面一行代码通过   超越70%
	if(flag)    return true;
            }
        }
        return flag;
    }
}