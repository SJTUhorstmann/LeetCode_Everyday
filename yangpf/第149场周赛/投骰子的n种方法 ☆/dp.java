class Solution {
    public int numRollsToTarget(int d, int f, int target) {
        int maxint = 1000000007;
        int[][] dp=new int[d+1][target+1];
        for(int i=1;i<=f && i<=target;i++){
            dp[1][i]=1;
        }
        for(int i=2;i<=d;i++){
            for(int j=i;j<=Math.min(i*f,target);j++){
                if(i==j || j==i*f)  dp[i][j]=1;
                else{
                    for(int k=1;k<=f;k++){
                        if(j-k<=0)   break;
                        if (dp[i][j] > maxint - dp[i-1][j-k]) dp[i][j] -= maxint;
                        dp[i][j]+=dp[i-1][j-k];
                    }
                }
            }
        }
        return dp[d][target];
    }
}