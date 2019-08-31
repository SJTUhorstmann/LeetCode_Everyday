public class Solution {
    public int Fibonacci(int n) {
        if(n<=1){
           return n; 
        } 
        int pre1=1;
        int pre2=1;
        int fib=1;
        for(int i=2;i<n;i++){
            fib=pre1+pre2;
            pre1=pre2;
            pre2=fib;
        }
        return fib;
}
}