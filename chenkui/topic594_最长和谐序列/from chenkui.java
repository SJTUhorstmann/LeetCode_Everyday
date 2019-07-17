class Solution {
   /*
   public int findLHS(int[] nums) {
     Map<Integer, Integer> countForNum = new HashMap<>();
     for (int num : nums) {
        countForNum.put(num, countForNum.getOrDefault(num, 0) + 1);
     }
     int longest = 0;
     for (int num : countForNum.keySet()) {
        if (countForNum.containsKey(num + 1)) {
            longest = Math.max(longest, countForNum.get(num + 1) + countForNum.get(num));
        }
     }
     return longest;
   }
   */
    
 public int findLHS(int[] nums) {
    if(nums.length == 0){
      return 0;
    }
    Arrays.sort(nums);
    int res=0;
    int start=0;
    int nextstart=0;
    for(int i = 1; i < nums.length; i++){
        if (nums[i] - nums[start] == 1){
            if (nums[nextstart] < nums[i]) {
                nextstart = i;
            }
            res = Math.max(res, i - start + 1);
        } 
        else if (nums[i] - nums[start] > 1) {
            start = start == nextstart ? i : nextstart;
            i--;
        }
    }
    return res;
}
}