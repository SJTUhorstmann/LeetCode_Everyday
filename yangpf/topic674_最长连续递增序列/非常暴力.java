// 击败5%
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length<=1)  return nums.length;
        int max=1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[j-1])   max=Math.max(max,j-i+1);
                else break;
            }
        }
        return max;
    }
}