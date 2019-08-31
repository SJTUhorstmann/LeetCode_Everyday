class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;//行数
        int n = grid[0].length;//列数
        int[][] dp = new int[m][n];
        dp[0][0]=grid[0][0];
        //状态转移方程
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++){
                if(i==0&&j!=0) dp[i][j]=grid[i][j]+dp[i][j-1];
                if(i!=0&&j==0) dp[i][j]+=grid[i][j]+dp[i-1][j];
                if(i!=0&&j!=0) dp[i][j] = grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m-1][n-1];      
    }
}