public class Solution {
    public boolean Find(int target, int [][] array) {
        int row=array.length;
        int column=array[0].length;
        int i=0,j=column-1;
        while(i<row && j>=0){
            if(array[i][j]<target){
                i++;
            }else if(array[i][j]>target){
                j--;
            }else{
                return true;
            }
        }
        return false;
    }
}