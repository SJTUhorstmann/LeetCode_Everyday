class Solution {
    public int maxProfit(int[] prices, int fee) {
      int N = prices.length;
        
      int[] buy = new int[prices.length];
      int[] arr1 = new int[prices.length];
      int[] sell = new int[prices.length];
      int[] arr2 = new int[prices.length];
        
      arr1[0] = buy[0] = -prices[0];
      sell[0] = arr2[0] = 0;
        
      for (int i = 1; i < N; i++) {
        buy[i] = Math.max(sell[i - 1], arr2[i - 1]) - prices[i];
        arr1[i] = Math.max(buy[i - 1], arr1[i - 1]);
        sell[i] = Math.max(buy[i - 1], arr1[i - 1]) - fee + prices[i];
        arr2[i] = Math.max(arr2[i - 1], sell[i - 1]);
    }
        
    return Math.max(sell[N - 1], arr2[N - 1]);
        
}
}