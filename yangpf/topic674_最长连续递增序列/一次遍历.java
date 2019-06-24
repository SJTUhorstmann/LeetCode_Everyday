class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length<=1)  return nums.length;
        int max=1;
        int globalMax=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                max++;
            }else{
                max=1;
            }
            if(max>=globalMax)  globalMax=max;
        }
        return globalMax;
    }
}