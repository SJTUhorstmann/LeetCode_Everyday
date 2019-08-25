class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if(len==0||len==1) return len;
        int[] dp = new int[len];
        Arrays.fill(dp, 1); //给数组每一位先赋初值
        int max =1;
        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]) dp[i]=Math.max(dp[j]+1,dp[i]);//用这种比较方法取出最大值     
            }
            max=Math.max(dp[i],max);
        }
        return max;
  }
}