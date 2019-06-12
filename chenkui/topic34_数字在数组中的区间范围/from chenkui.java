class Solution {
    public int[] searchRange(int[] nums, int target) {
      int l=0;
      int r=nums.length-1;
      int index=-1;
      int[] arr=new int[2];
      arr[0]=-1;
      arr[1]=-1;
      while(l<=r){
        int mid=l+(r-l)/2;
        if(nums[mid]==target){
          index=mid;
          break;
        }
        else if(nums[mid]<target){
          l=mid+1;
        }
        else{
          r=mid-1;
        }
      }
      if(index!=-1){
        arr[0]=index;
        arr[1]=index;
        for(int i=index;i>=0;i--){
          if(nums[i]!=target){
            break;
          }
          else{
            arr[0]=i;
          }
        }
        for(int i=index;i<nums.length;i++){
          if(nums[i]!=target){
            break;
          }
          else{
            arr[1]=i;
          }
        }
      }
      return arr; 
    }
}