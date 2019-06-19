class Solution {
    public int singleNumber(int[] nums) {
        if (nums==null) return 0;
        int res=nums[0];
        for (int i=1;i<nums.length;i++){
            res^=nums[i];
        }
        return res;
        
    }
}