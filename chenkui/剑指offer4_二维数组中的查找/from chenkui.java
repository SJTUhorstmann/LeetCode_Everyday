public class Solution {
    public boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0 || array[0].length == 0){
            return false;
        }
        int row = array.length;
        int col = array[0].length;
        if(target > array[row-1][col-1] || target < array[0][0]){
            return false;
        }
        int row1 = 0;
        int col1 = col-1;
        while(row1<row && col>=0){
            if(target==array[row1][col1]){
                return true;
            }
            else if(target<array[row1][col1]){
                col1--;
            }
            else{
                row1++;
            }
        }
        
        return false;
         
    }
}