class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length*nums[0].length!=r*c) return nums;
        int[][] array=new int[r][c];
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j]=nums[count/nums[0].length][count%nums[0].length];
                count++;
            }
        }
        return array;
    }
}