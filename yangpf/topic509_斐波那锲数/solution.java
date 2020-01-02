//动态规划
class Solution {
    public int fib(int N) {
        int[] dp=new int[N+1];
        if(N<2) return N;
        dp[0]=0;dp[1]=1;
        for(int i=2;i<=N;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[N];
    }
}

//递归
class Solution {
    public int fib(int N) {
        if(N<2) return N;
        return fib(N-1)+fib(N-2);
    }
}