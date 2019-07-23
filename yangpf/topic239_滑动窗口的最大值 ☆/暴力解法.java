class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0)  return new int[0];
        int[] res=new int[nums.length-k+1];
        int index=0;
        for(int i=0;i<nums.length-k+1;i++){
            res[index++]=getMax(nums,i,k);
        }
        return res;
    }
    public int getMax(int[] nums,int start,int size){
        int max=Integer.MIN_VALUE;
        for(int i=start;i<start+size;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
}
