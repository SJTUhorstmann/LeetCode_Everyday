class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        quickSort(nums,0,n-1);
        return nums;
    }
    public void quickSort(int[] nums,int l,int r){
        if(l>=r)    return;
        int p=partition(nums,l,r);
        quickSort(nums,l,p-1);
        quickSort(nums,p+1,r);
    }
    public int partition(int[] nums,int l,int r){
        int value=nums[l];
        int j=l;
        for(int i=l+1;i<=r;i++){
            if(nums[i]<value){
                swap(nums,i,j+1);
                j++;
            }
        }
        swap(nums,l,j);
        return j;
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}