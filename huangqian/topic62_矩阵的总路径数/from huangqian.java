public class Solution62 {
    public int uniquePaths(int m, int n) {
        int[][] f=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||j==0) f[i][j]=1;
                else {
                f[i][j]=f[i-1][j]+f[i][j-1];
                }
            }
        }
        return f[n-1][m-1];
    }
}