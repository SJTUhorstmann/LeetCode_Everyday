class Solution {
    public int findLongestChain(int[][] pairs) {
      if(pairs==null || pairs.length==0) 
        return 0;
      
      Arrays.sort(pairs,(a,b)->a[0]-b[0]);
      int[] dp=new int[pairs.length];
      Arrays.fill(dp,1);
      
      for(int i=0;i<pairs.length;i++){
        for(int j=0;j<i;j++){
          if(pairs[j][1]<pairs[i][0]){
            dp[i]=Math.max(dp[i],dp[j]+1);
          }
        }
      }
      
      int max=1;

      for(int tem:dp){
        max=Math.max(tem,max);
      }
      return max;
    }
}