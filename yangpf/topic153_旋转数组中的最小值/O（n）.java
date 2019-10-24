class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i+1]<nums[i]){
                return nums[i+1];
            }
        }
        return nums[0];
    }
}