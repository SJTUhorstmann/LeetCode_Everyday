class Solution {
    public int[] sortArray(int[] nums) {
        //冒泡排序
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]) swap(nums,j,j+1);
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