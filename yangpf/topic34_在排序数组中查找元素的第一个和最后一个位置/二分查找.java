class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int mid=(low+high)/2;
        int index=-1;
        int[] array=new int[]{-1,-1};
        while(low<=high){
            if(nums[mid]>target){
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                index=mid;
                break;
            }
            mid=(high+low)/2;
        }
        if(index==-1)   return array;
        for(int i=index;i>=0;i--){
            if(nums[i]==target) array[0]=i;
            else break;
        }
        for(int i=index;i<nums.length;i++){
            if(nums[i]==target) array[1]=i;
            else break;
        }
        return array;
    }
}