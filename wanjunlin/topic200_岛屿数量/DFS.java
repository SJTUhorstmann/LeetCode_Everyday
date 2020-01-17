class Solution {
    private int m,n;
    private int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    public int numIslands(char[][] grid) {
        m = grid.length;
        if(m==0){
            return 0;
        }
        n = grid[0].length;
        int level = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!='0'){
                    dfs(grid,i,j);
                    level++;
                }
            }
        }
        return level;
    }
    public void dfs(char[][] grid,int row, int col){
        if(row<0||row>=m||col<0||col>=n||grid[row][col]=='0'){
            return;
        }
        grid[row][col]='0';
        for(int[] d:directions){
            dfs(grid,row+d[0],col+d[1]);
        }
    }
}