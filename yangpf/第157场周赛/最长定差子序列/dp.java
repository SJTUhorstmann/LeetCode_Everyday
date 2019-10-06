//此方法超时
class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int n=arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int max=1;
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]-arr[j]==difference){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    max=Math.max(dp[i],max);   
                    break;
                }
            }
        }
        return max;
    }
}