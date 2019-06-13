class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0)   return "";
        boolean[][] dp=new boolean[s.length()][s.length()];
        int max=-1;
        String res="";
        for(int j=0;j<s.length();j++){
            for(int i=0;i<=j;i++){
                // if(i==j){
                //     dp[i][j]=true;
                // }
                if(s.charAt(i)==s.charAt(j) && j-i<=2){
                    dp[i][j]=true;
                }
                else if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j]=true;
                }
                if(dp[i][j] && j-i+1>=max){
                    max=j-i+1;
                    res=s.substring(i,j+1);
                }
            }
        }
        return res;
    }
}