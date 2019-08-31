class Solution {
    public int missingNumber(int[] nums) {
       
        int len = nums.length;
        int[] tempNum = new int[len];
        tempNum[0] = len;
        for(int i=0;i<len;i++){
            for(int x:nums){
                if(x==i) tempNum[i]=x;
            }
        }
        for(int i=0;i<len;i++){
            if(tempNum[i]!=i) return i;
        }
        return len;      
    }
}