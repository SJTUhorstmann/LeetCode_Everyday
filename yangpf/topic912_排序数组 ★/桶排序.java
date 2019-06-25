class Solution {
    public int[] sortArray(int[] nums) {
        int[] bucket=new int[100000];
        for(int num:nums){
            bucket[num+50000]++;
        }
        int index=0;
        for(int i=0;i<bucket.length;i++){
            int num=bucket[i];
            while(num!=0){
                nums[index++]=i-50000;
                num--;
            }
        }
        return nums;
    }
}