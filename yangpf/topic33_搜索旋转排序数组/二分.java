class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int i=0,j=n-1;
        while(i<=j){
            int left=nums[i];
            int right=nums[j];
            int mid=nums[(i+j)/2];
            if(target==mid){
                return (i+j)/2;
            }
            if(left<=mid){
                if(target<mid&&target>=left){
                    j=(i+j)/2-1;
                }else{
                    i=(i+j)/2+1;
                }
            }else{
                if(target>mid&&target<=right){
                    i=(i+j)/2+1;
                }else{
                    j=(i+j)/2-1;
                }
            }
        }
        return -1;
    }
}