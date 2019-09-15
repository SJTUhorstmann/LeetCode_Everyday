class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max=Math.max(max,dfs(grid,i,j));
            }
        }
        return max;
    }
    public int dfs(int[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0){
            return 0;
        }
        int[] X=new int[]{1,0,-1,0};
        int[] Y=new int[]{0,1,0,-1};
        int area=1;
        grid[i][j]=0;
        for(int k=0;k<4;k++){
            //grid[i+X[k]][j+Y[k]]=0;
            area+=dfs(grid,i+X[k],j+Y[k]);
        }
        return area;
    }
}