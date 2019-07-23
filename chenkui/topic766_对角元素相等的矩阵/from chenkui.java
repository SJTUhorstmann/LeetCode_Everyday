class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
    int m=matrix.length;
    int n=matrix[0].length;
    if(m==1 || n==1) return true;
    for(int i=0;i<n;i++){
      int tem=matrix[m-1][i];
      int j=0;
      while(j<=i && m-1-j>=0){
        if(matrix[m-1-j][i-j]!=tem) return false;
        j++;
      }
    }
    for(int i=0;i<m-1;i++){
      int tem1=matrix[i][n-1];
      int k=0;
      while(k<=i && n-1-k>=0){
        if(matrix[i-k][n-1-k]!=tem1) return false;
        k++;
      }
    }    
    return true;
    }
}