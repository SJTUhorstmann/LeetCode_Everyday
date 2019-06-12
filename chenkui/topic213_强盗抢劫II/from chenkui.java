class Solution {
    public int rob(int[] nums) {
      if(nums==null || nums.length<1) return 0;
      if(nums.length==1) return nums[0];
      if(nums.length==2) return Math.max(nums[0],nums[1]);
      int[] arr=new int[nums.length];
      arr=nums.clone();
      arr[0]=0;
      nums[nums.length-1]=0;
      return Math.max(rob1(nums),rob1(arr));  
    }
    public int rob1(int[] nums) {
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