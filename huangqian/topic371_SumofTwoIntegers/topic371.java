public class Solution371 {
    public int getSum(int a, int b) {
        if(a==0) return b;
        if(b==0) return a;
        //异或是不进位加法，另外选一位进位
        int sum=a^b;
        int carry=(a&b)<<1;
        return getSum(sum,carry);
    }
}