class Solution {
    public int minMoves2(int[] nums) {
        
        if(nums.length<=1) return 0;
        
        int move=0;
        int left=0;
        int right=nums.length-1;
        Arrays.sort(nums);
        
        while(left<right){
            move=move+nums[right]-nums[left];
            right--;
            left++;
        }
        return move;
    }
}