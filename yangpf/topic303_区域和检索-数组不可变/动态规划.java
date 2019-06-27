class NumArray {
    int[] dp;
    public NumArray(int[] nums) {
        dp=new int[nums.length];
        int sum=0;
        for(int i=0;i<dp.length;i++){
            sum+=nums[i];
            dp[i]=sum;
        }
    }
    
    public int sumRange(int i, int j) {
        if(i==0)    return dp[j];
        return dp[j]-dp[i-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */