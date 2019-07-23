class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> arr = new HashMap<>();
        Map<Integer, Integer> Last = new HashMap<>();
        Map<Integer, Integer> First = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            arr.put(num, arr.getOrDefault(num, 0) + 1);
            Last.put(num, i);
            if (!First.containsKey(num)) {
                First.put(num, i);
            }
        }
        int maxCnt = 0;
        for (int num : nums) {
            maxCnt = Math.max(maxCnt, arr.get(num));
        }
        int ret = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int cnt = arr.get(num);
            if (cnt != maxCnt) continue;
            ret = Math.min(ret, Last.get(num) - First.get(num) + 1);
        }
        return ret;
    }
}