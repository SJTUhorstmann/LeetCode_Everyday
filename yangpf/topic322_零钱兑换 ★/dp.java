class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<0 || coins.length==0) return -1;
        int[] dp=new int[amount+1];
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<coins.length;j++){
                int value=i-coins[j];
                if(value>=0 && dp[value]!=-1){
                    min=Math.min(min,dp[value]+1);
                }
            }
            dp[i]= min==Integer.MAX_VALUE?-1:min;
        }
        return dp[amount];
    }
}