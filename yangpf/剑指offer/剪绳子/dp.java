public class Solution {
    public int cutRope(int target) {
        int[] dp=new int[target+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=target;i++){
            int max=1;
            for(int j=i-1;j>0;j--){
                max=Math.max(max,Math.max(dp[j],j)*(i-j));
            }
            dp[i]=max;
        }
        return dp[target];
    }
}