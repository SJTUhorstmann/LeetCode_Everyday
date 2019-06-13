class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        if(n==1)    return 1-nums[0];
        boolean[] flags=new boolean[n+1];
        for(int i=0;i<n;i++){
            flags[nums[i]]=true;
        }
        for(int i=0;i<=n;i++){
            if(!flags[i])   return i;
        }
        return -1;
    }
}