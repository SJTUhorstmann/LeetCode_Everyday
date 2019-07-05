class Solution {
  
    public int maximumProduct(int[] nums) {
        if(nums==null || nums.length<3) 
            return 0;
        
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
      
        for (int i=0;i<nums.length;i++) {
            int tem=nums[i];
            if (tem > max1) {
               max3 = max2;
               max2 = max1;
               max1 = tem;
            } 
            else if (tem > max2) {
               max3 = max2;
               max2 = tem;
            } 
            else if (tem > max3) {
               max3 = tem;
            }
            if (tem < min1) {
               min2 = min1;
               min1 = tem;
            } 
            else if (tem < min2) {
               min2 = tem;
        }
    }
        
    return Math.max(max1*max2*max3, max1*min1*min2);
}

}