class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int max=0;
        int tem=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==1){
                tem++;
            }
            else{
                max=Math.max(max,tem);
                tem=0;
            }
            
        }
        max=Math.max(max,tem);
        return max;
        
    }
}