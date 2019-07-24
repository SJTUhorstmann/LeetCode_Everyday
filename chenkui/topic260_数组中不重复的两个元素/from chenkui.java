class Solution {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for (int num : nums){
            diff = diff ^ num;
        } 
        
        diff = diff & -diff; 
        int[] ret = new int[2];
        
        for (int num : nums) {
            if ((num & diff) == 0) {
                ret[0] =ret[0] ^ num;
            }
            else{
                ret[1] =ret[1] ^ num;  
            } 
        }
        return ret;
    }
}