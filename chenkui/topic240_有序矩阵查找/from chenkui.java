class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        } 
        
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n - 1;
        
        while (row < m && col >= 0) {
            if (target == matrix[row][col]){
                return true;
            } 
            else if (target < matrix[row][col]){
                col--;
            } 
            else{
                row++;
            } 
        }
        return false;
    }
}