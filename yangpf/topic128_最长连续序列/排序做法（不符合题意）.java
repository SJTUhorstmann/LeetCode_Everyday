class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1)  return nums.length;
        Arrays.sort(nums);
        int maxLen=1;
        int len=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                len++;
                maxLen=Math.max(maxLen,len);
            }else if(nums[i]==nums[i-1]){
                continue;
            }
            else{
                len=1;
            }
        }
        return maxLen;
    }
}