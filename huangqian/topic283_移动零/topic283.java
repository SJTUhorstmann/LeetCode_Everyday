public void moveZeroes(int[] nums) {
    int l=nums.length;
    int k=0;
    for (int i=0;i<l;i++){
        if (nums[i]!=0){
            nums[k]=nums[i];
            k++;
        }
    }
    for (;k<l;k++){
        nums[k]=0;
    }
}