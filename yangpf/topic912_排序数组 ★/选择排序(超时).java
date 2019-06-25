class Solution {
    public int[] sortArray(int[] nums) {
        //选择排序
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]) swap(nums,i,j);
            }
        }
        return nums;
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}