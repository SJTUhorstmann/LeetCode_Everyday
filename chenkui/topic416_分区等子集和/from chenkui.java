class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        
        for(int num:nums){
           sum=sum+num;
        }
        
        if(sum%2==1) 
            return false;
        int mid=sum/2;
        boolean[] dp=new boolean[mid+1];
        dp[0]=true;
        for(int num:nums){
            for(int i=mid;i>=num;i--){
                dp[i]=dp[i]||dp[i-num];
                if(dp[mid]==true) 
                    return true;
            }
        }
        return dp[mid];
    }
}