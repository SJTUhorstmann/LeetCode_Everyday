class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> numsCount = new HashMap<>();
        Map<Integer,Integer> numsFirstIndex = new HashMap<>();
        Map<Integer,Integer> numsLastIndex  = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            numsCount.put(num,numsCount.getOrDefault(num,0)+1);
            numsLastIndex.put(num,i);
            if(!numsFirstIndex.containsKey(num)){
                numsFirstIndex.put(num,i);
            }
        }
        int maxCnt = 0;
        for(int num:nums){
            int cnt = numsCount.get(num);
            maxCnt = Math.max(maxCnt,cnt);
        }
        int ret = nums.length;
        for(int num:nums){
            int cnt = numsCount.get(num);
            if(cnt!=maxCnt){
                continue;
            }
            ret= Math.min(ret,numsLastIndex.get(num)-numsFirstIndex.get(num)+1);
        }
        return ret;
    }
}