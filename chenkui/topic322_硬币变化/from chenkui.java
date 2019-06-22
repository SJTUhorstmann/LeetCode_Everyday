class Solution {
        public static int coinChange(int[] coins, int amount) {

        if (coins == null || coins.length == 0 || amount <= 0)
            return 0;
        int[] minNumber = new int[amount + 1];
        Arrays.fill(minNumber, Integer.MAX_VALUE);
        minNumber[0] =0;
       
        for(int coin : coins) {
            for (int i = 1; i <= amount; i++) {
                if (coin <= i && minNumber[i - coin] != Integer.MAX_VALUE)
                    minNumber[i] = Integer.min(minNumber[i], 1 + minNumber[i - coin]);
            }
        }
        if (minNumber[amount] == Integer.MAX_VALUE)
            return -1;
        else
            return minNumber[amount];
    }
}