class Solution {
    public int minDistance(String word1, String word2) {
        if(word1==null || word2==null) 
            return 0;
        if(word1.length()==0 || word2.length()==0)
            return word1.length()+word2.length();
        
        int[][] dp=new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++){
            for(int j=0;j<word2.length();j++){
                if(i==0 && j==0){
                    if(word1.charAt(i)==word2.charAt(j))
                        dp[i][j]=1;
                    
                    else 
                        dp[i][j]=0;
                }
                else if(i==0){
                     if(word1.charAt(i)==word2.charAt(j))
                        dp[i][j]=1;
                     else
                        dp[i][j]=dp[i][j-1];
                }
                else if(j==0){
                     if(word1.charAt(i)==word2.charAt(j))
                        dp[i][j]=1;
                     else
                        dp[i][j]=dp[i-1][j];
                }
                else{
                    if(word1.charAt(i)==word2.charAt(j))
                       dp[i][j]=dp[i-1][j-1]+1;
                    else
                       dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
    
    return word1.length()+word2.length()-2*dp[word1.length()-1][word2.length()-1];                 
}
}