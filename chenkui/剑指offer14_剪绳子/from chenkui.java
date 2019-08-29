class Solution {
    public int integerBreak(int n) {
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        int[] dp = new int[n+1];
        dp[2]=1;
        dp[3]=2;
        for(int i=4;i<=n;i++){
            for(int j=1;j<i;j++){
                int tem=Math.max(j*(i-j),dp[j]*(i-j));
                dp[i]=Math.max(dp[i],tem);
            }
        }
        return dp[n];
        
    }
}
