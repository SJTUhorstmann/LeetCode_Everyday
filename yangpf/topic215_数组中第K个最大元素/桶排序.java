class Solution {
    public int findKthLargest(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        int[] bucket=new int [max-min+1];
        for(int num:nums){
            bucket[num-min]++;
        }
        int count=0;
        for(int i=bucket.length-1;i>=0;i--){
            count+=bucket[i];
            if(count>=k)    return min+i;
        }
        return -1;
    }
}