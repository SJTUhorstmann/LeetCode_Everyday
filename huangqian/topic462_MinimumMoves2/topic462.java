public static int minMoves2(int[] nums) {
    Arrays.sort(nums);
    int n=nums.length;
    int val=nums[n/2];
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=Math.abs(nums[i]-val);
    }
    return sum;
}