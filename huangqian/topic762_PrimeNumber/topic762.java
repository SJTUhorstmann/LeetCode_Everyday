public class Solution762 {
    public int countPrimeSetBits(int L, int R) {
        int[] prime={2,3,5,7,11,13,17,19};
        int res=0;
        for(int i=L;i<=R;i++){
            int s=0;
            for(int k=i;k!=0;k>>=1){
                s+=k&1;//右移1位直到k等于0为止
            }
            for(int x:prime){
                if(x==s) res++;
            }
        }
        return res;
    }
}