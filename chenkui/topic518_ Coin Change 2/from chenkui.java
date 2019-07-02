class Solution {
    public int change(int amount, int[] coins) {
        if(coins==null || coins.length==0)
           return 0;
        if(amount==0 && ) return 1;
        int[] dp=new int[amount+1];
        dp[0]=1;
        
        for(int i=0;i<coins.length;i++){
            int tem=coins[i];
            for(int j=tem;j<=amount;j++){
                dp[j]=dp[j]+dp[j-tem];
            }
        }
        return dp[amount];
}

}