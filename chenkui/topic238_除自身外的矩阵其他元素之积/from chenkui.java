class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int len = nums.length;
        int[] arr = new int[len];
        Arrays.fill(arr, 1);
        
        int left = 1;
        for (int i = 1; i < len; i++) {
           left *= nums[i - 1];
           arr[i] *= left;
        }
        
        int right = 1;
        for (int i = len - 2; i >= 0; i--) {
        right *= nums[i + 1];
        arr[i] *= right;
        }
        
    return arr;
}
}