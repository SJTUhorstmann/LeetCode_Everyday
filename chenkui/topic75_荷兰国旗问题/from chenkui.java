class Solution {
    public void sortColors(int[] nums) {
      int left=-1;
      int mid=0;
      int right=nums.length;
      while(mid<right){
        if(nums[mid]==0){
          swap(nums,++left,mid++);
        }
        else if(nums[mid]==2)
        {
          swap(nums,mid,--right);
        }
        else{
          mid++;
        }
      }   
    }
    public void swap(int[] nums,int a,int b){
      int tem=nums[a];
      nums[a]=nums[b];
      nums[b]=tem;
    }
}
 
}
