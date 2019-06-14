class Solution {
    public boolean increasingTriplet(int[] nums) {
        //int n=nums.length;
        //if(n<3) return false;
        int min=Integer.MAX_VALUE;
        int mid=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<=min){
                min=num;
            }else if(num<=mid){
                mid=num;
            }else{
                return true;
            }
        }
        return false;
    }
}