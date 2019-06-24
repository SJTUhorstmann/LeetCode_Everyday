class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int len=prices.length;
        if(len<=1)  return 0;
        for(int i=0;i<len-1;i++){
            if(prices[i+1]>prices[i]) {
                max=max+prices[i+1]-prices[i];
            }
        }
        return max;               
    }
}