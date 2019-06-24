class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0)  return 0;
        int n=nums.length;
        int[] dp=new int[n];
        dp[n-1]=1;
        int globalMax=1;
        for(int i=n-1;i>=0;i--){
            dp[i]=1;
            int max=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j]){
                    max=Math.max(max,dp[j]+1);
                }
            }
            dp[i]=max;
            globalMax=Math.max(globalMax,dp[i]);
        }
        return globalMax;
    }
}