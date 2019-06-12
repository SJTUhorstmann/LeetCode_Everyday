class NumArray {
  int[] tem;
  public NumArray(int[] nums) {
    tem=new int[nums.length+1];
    
    for(int i=0;i<nums.length;i++){
      tem[i+1]=nums[i]+tem[i];
    }
  }
    
  public int sumRange(int i, int j) {
     return tem[j+1]-tem[i];
  }
}
