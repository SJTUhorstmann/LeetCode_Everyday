public class Solutiob891 {
    public int sumSubseqWidths(int[] A) {
        Arrays.sort(A);
        int mod=1000000007;
        long p=1,res=0,sum=0;

        for(int x:A){
            res=(res+x*(p-1)-sum)%mod;
            sum=(2*sum+x)%mod;
            p=(p*2)%mod;
        }

        return (int)(res+mod)%mod;

    }
}