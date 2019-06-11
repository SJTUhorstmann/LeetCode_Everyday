class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        if(n>1){
            int j=0;
            for(int i=0;i<n;i++){
                if(nums[i]!=0){
                    nums[j++]=nums[i];
                }
            }
            if(j<=n-1){
                for(int i=j;i<n;i++){
                    nums[i]=0;
                }
            }
        }
    }
}