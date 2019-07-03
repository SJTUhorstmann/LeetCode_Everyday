class Solution {
   public int combinationSum4(int[] nums, int target) {

    if (nums == null || nums.length == 0) {
        return 0;
    }

    int[] maximum = new int[target + 1];
    maximum[0] = 1;
    Arrays.sort(nums);

    for (int i = 1; i <= target; i++) {
        for (int j = 0; j < nums.length && nums[j] <= i; j++) {
            maximum[i] += maximum[i - nums[j]];
        }
    }

    return maximum[target];
}
}