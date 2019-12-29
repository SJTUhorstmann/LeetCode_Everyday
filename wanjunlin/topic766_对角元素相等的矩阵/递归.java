class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            if(!check(matrix,matrix[i][0],i,0)){
                return false;
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            if(!check(matrix,matrix[0][i],0,i)){
                return false;
            }
        }
        return true;
    }
    public boolean check(int[][] matrix, int exceptValue, int row, int col){
        if(row>=matrix.length||col>=matrix[0].length){
            return true;
        }
        if(matrix[row][col]!=exceptValue){
            return false;
        }
        return check(matrix,exceptValue,row+1,col+1);
    }
}