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