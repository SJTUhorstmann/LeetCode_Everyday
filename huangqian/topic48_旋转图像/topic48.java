class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0,n=matrix.length;i<=n/2;i++){
            for(int j=i;j<n-1-i;j++){
                int temp=matrix[j][n-i-1];
                matrix[j][n-1-i] = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = temp;

            }
        }
        
    }
}