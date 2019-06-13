class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int column=matrix[0].length;
        int[][] array=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                array[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(containsZero(array,i,j))    matrix[i][j]=0;
            }
        }
    }
    public boolean containsZero(int[][] matrix,int rowIndex,int columnIndex){
        int row=matrix.length;
        int column=matrix[0].length;
        for(int i=0;i<row;i++){
            if(matrix[i][columnIndex]==0)   return true;
        }
        for(int j=0;j<column;j++){
            if(matrix[rowIndex][j]==0)   return true;
        }
        return false;
    }
}