class Solution {
    public int removeDuplicates(int[] nums) {
        int l=nums.length;
        int k=0;
        for(int i=0;i<l;i++){
            if(nums[k]!=nums[i]){
                k++;
                nums[k]=nums[i];               
            }
            
        }
        return k+1;
    }
}