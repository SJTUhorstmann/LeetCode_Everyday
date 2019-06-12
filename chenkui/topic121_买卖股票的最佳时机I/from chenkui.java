class Solution {
    public int maxProfit(int[] prices) {
      if(prices==null || prices.length<2) return 0;
      int proift=0;
      int sofamin= prices[0];
      for(int i=1;i<prices.length;i++){
        if(sofamin<prices[i]) proift=Math.max(proift,prices[i]-sofamin);
        else
        sofamin=prices[i];
      }
      return proift; 
    }
}