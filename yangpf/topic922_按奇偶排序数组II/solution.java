//使用了额外的数组空间
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int len=A.length;
        int count1=0;
        int count2=1;
        int[] res=new int[len];
        for(int i=0;i<len;i++){
            if(A[i]%2==0){
                res[count1]=A[i];
                count1+=2;
            }else{
                res[count2]=A[i];
                count2+=2;
            }
        }
        return res;
    }
}

//不适用额外空间，交换位置
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int j=1;
        for(int i=0;i<A.length;i=i+2){
            if(A[i]%2==1){
                while(j<A.length && A[j]%2==1){
                    j=j+2;
                }
                int tmp=A[j];
                A[j]=A[i];
                A[i]=tmp;
            }
        }
        return A;
    }
}