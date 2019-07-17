public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n==0)    return 0;
        int[] dp=new int[n+1];
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+countOne(i);
        }
        return dp[n];
    }
    public int countOne(int value){
        int count=0;
        String s=String.valueOf(value);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')    count++;
        }
        return count;
    }
}