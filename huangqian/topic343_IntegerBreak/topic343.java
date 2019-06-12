//¾¡¿ÉÄÜ¶à²ğ3
public class Solution343 {
    public int integerBreak(int n) {
        if(n<=3) return n-1;
        int a=n/3;
        if(n%3==0) return (int)Math.pow(3,a);
        if(n%3==1) return (int)Math.pow(3,a-1)*4;
        if(n%3==2) return (int)Math.pow(3,a)*2;
        return 0;
    }
}