class Solution {
    public int singleNumber(int[] nums) {
        int num=0;
        for(int inums){
            num=i^num;
        }
        return num;
    }
}