class Solution {
    int[] dx=new int[]{1,0,-1,0};
    int[] dy=new int[]{0,1,0,-1};
    public int getMaximumGold(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    max=Math.max(dfs(grid,i,j),max);
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid,int i,int j){
        int m=grid.length;
        int n=grid[0].length;
        if(i<0||i>=m||j<0||j>=n||grid[i][j]==0)    return 0;
        int val=grid[i][j];
        int sum=val;
        grid[i][j]=0;
        sum+=Math.max(Math.max(dfs(grid,i+1,j),dfs(grid,i-1,j)),Math.max(dfs(grid,i,j+1),dfs(grid,i,j-1)));
        grid[i][j]=val;
        return sum;
    }
}