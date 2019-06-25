class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        mergeSort(nums,0,n-1);
        return nums;
    }
    public void mergeSort(int[] nums,int l,int r){
        if(l>=r)    return;
        int mid=(l+r)/2;
        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,r);
        merge(nums,l,mid,r);
    }
    public void merge(int[] nums,int l,int mid,int r){
        int n=nums.length;
        //int[] aux=new int[n];
        int[] aux=new int[r-l+1];
        for(int i=l;i<=r;i++){
            aux[i-l]=nums[i];
        }
        int i=l,j=mid+1;
        for(int k=l;k<=r;k++){
            if(i>mid){
                nums[k]=aux[j-l];
                j++;
            }
            else if(j>r){
                nums[k]=aux[i-l];
                i++;
            }
            else if(aux[i-l]>aux[j-l]){
                nums[k]=aux[j-l];
                j++;
            }else{
                nums[k]=aux[i-l];
                i++;
            }
        }
    }
}