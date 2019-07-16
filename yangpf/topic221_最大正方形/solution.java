class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0)    return 0;
        int max=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                while(allOne(matrix,i,j,max+1)){
                    max=max+1;
                }
            }
        }
        return max*max;
    }
    public boolean allOne(char[][] matrix,int x,int y,int len){
        if(x+len>matrix.length || y+len>matrix[0].length)   return false;
        for(int i=x;i<x+len;i++){
            for(int j=y;j<y+len;j++){
                if(matrix[i][j]!='1') return false;
            }
        }
        return true;
    }
}
