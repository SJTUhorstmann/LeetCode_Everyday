//暴力法 两次遍历  同时还使用了额外的数组空间
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] B=new int[A.length];
        int index=0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                B[index++]=A[i];
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i]%2!=0){
                B[index++]=A[i];
            }
        }
        return B;
    }
}

//一次遍历，双指针
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i=0,j=A.length-1;
        while(i<j){
            if(A[j]%2==0 && A[i]%2!=0){
                swap(A,i,j);
                i++;
                j--;
            }else if(A[j]%2!=0){
                j--;
            }else{
                i++;
            }
        }
        return A;
    }
    public void swap(int[] A,int i,int j){
        int tmp=A[i];
        A[i]=A[j];
        A[j]=tmp;
    }
}