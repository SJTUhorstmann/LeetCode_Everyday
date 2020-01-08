class Solution {
    public int[] sumZero(int n) {
        int[] res=new int[n];
        int count=0;
        int num=1;
        while(count<n){
            res[count++]=num;
            if(count>=n)    break;
            res[count++]=-num;
            num++;
        }
        if(n%2==1)  res[n-1]=0;
        return res;
    }
}