class Solution {
    public boolean checkPossibility(int[] nums) {
      int count=0;
      if(nums.length<3) return true;
      for(int i=1;i<nums.length;i++){
        if(nums[i]>=nums[i-1]) continue;
        if(++count>1) return false;
        if(i>1 && nums[i]<nums[i-2]){
          nums[i]=nums[i-1];
        }
        else{
          nums[i-1]=nums[i];
        }
      }
      return true;
    }
}