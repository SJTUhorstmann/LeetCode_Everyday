class Solution {
    public int rob(int[] nums) {
      if(nums==null || nums.length<1) return 0;
      int money=0;
      int first=nums[0];
      if(nums.length==1) return first;
      int second=Math.max(nums[0],nums[1]);
      if(nums.length==2) return second;
      for(int i=2;i<nums.length;i++){
        money=Math.max(first+nums[i],second);
        first=second;
        second=money;
      }
      return money;
    }
}