class Solution {
    public int change(int amount, int[] coins) {

        if(amount <=0) return 1;
        if(amount>0 && coins.length<1) return 0;
        int[] dp = new int[amount+1];
        dp[0] = 1;

        for(int j = 0; j < coins.length; j++ ) {
            for(int i = 1; i < dp.length; i++) {
                if(i - coins[j] >=0) {
                    int subamount = i - coins[j];
                    dp[i] += dp[subamount];
                }
            }
        }

        return dp[dp.length-1];
    }
}