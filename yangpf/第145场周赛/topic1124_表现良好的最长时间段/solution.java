class Solution {
    public int longestWPI(int[] hours) {
        int[] arr=new int[hours.length];
        for(int i=0;i<arr.length;i++){
            if(hours[i]>8)  arr[i]=1;
            else arr[i]=-1;
        }
        //dp[i]表示1到第i个元素和
        int[] dp=new int[hours.length+1];
        dp[0]=0;
        for(int i=1;i<=hours.length;i++){
            dp[i] =arr[i-1] + dp[i-1];
        }
        int max=0;
        int len=hours.length;
        while(len>0){
            for(int i=0;i<hours.length-len + 1;i++){
                if(dp[i+len]-dp[i]>0)   return len;
            }
            len--;
        }
        return 0;
    }
}