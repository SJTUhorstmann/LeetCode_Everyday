class Solution {
    public void moveZeroes(int[] nums) {
      if(nums==null || nums.length<2){
           return;
      } 
      int j=0;
      int tem;
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
          tem=nums[j];
          nums[j]=nums[i];
          nums[i]=tem;
          j++;
        }
      }
    }
}