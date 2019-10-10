class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length;
        if(m==0)    return 0;
        int n=matrix[0].length;
        if(n==0)    return 0;
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='0'){
                    arr[i][j]=0;
                    count=0;
                }else{
                    count++;
                    arr[i][j]=count;
                }
            }
        }
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int minWidth=Integer.MAX_VALUE;
                for(int k=i;k>=0;k--){
                    minWidth=Math.min(minWidth,arr[k][j]);
                    max=Math.max(max,(i-k+1)*minWidth);
                }
            }
        }
        return max;
    }
}