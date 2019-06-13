class Solution {
    public int numberOfArithmeticSlices(int[] A) {
      if(A.length<3) return 0;
      int[] dp=new int[A.length];
      for(int i=2;i<A.length;i++){
        if(A[i]-A[i-1]==A[i-1]-A[i-2]){
          dp[i]=dp[i-1]+1;
        }
      }
      int sum=0;
      for(int i=0;i<dp.length;i++){
        sum=sum+dp[i];
      }
      return sum;
    }
}