class Solution {
    public int minMoves2(int[] nums) {
        
        if(nums.length<=1) return 0;
        
        Arrays.sort(nums);
        int move=0;
        int left=0;
        int right=nums.length-1;
        
        while(left<right){
            move=move+nums[right]-nums[left];
            right--;
            left++;
        }
        return move;
    }
}