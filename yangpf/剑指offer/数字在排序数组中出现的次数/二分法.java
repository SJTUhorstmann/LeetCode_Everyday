public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int low=0,high=array.length-1;
        int mid=low+(high-low)/2;
        while(low<=high){
            if(array[mid]>k) high=mid-1;
            else if(array[mid]<k)    low=mid+1;
            else{
                return countNum(array,k,mid);
            }
            mid=low+(high-low)/2;
        }
        return 0;
    }
    //从有序数组的index索引左右扩散找target出现的次数
    public int countNum(int[] array,int target,int index){
        int num=0;
        for(int i=index;i>=0;i--){
            if(array[i]==target){
                num++;
            }else{
                break;
            }
        }
        for(int i=index+1;i<array.length;i++){
            if(array[i]==target){
                num++;
            }else{
                break;
            }
        }
        return num;
    }
}