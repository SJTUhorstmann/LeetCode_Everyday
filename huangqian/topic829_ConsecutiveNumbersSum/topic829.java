public class Solution829 {
    public int consecutiveNumbersSum(int N) {
        int res=0;
        for(int b=1;b*(b-1)<2*N;b++){
            if(2*N%b==0&&(2*N/b-(b-1))%2==0) res++;
        }
        return res;
    }
}