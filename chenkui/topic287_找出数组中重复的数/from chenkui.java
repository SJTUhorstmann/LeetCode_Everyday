class Solution {
    
    //方法1
    /*
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return nums[0];
    }
    */
    
     //方法2
    public int findDuplicate(int[] nums) {
         int l = 1;
         int h = nums.length - 1;
         while (l <= h) {
             int mid = l + (h - l) / 2;
             int cnt = 0;
             for (int i = 0; i < nums.length; i++) {
                 if (nums[i] <= mid) cnt++;
             }
             if (cnt > mid) {
                 h = mid - 1;
             }
             else{
             l = mid + 1;
            }
         }
     return l;
}
}