class Solution {
    public int lengthOfLongestSubstring(String s) {
      if(s.length()==0) return 0;
      int curLen = 0;
      int maxLen = 0;
      int[] preIndexs = new int[256];
      Arrays.fill(preIndexs, -1);
      for (int curI = 0; curI < s.length(); curI++) {
        int c = s.charAt(curI);
        int preI = preIndexs[c];
        if (preI == -1 || curI - preI > curLen) {
            curLen++;
        } else {
            maxLen = Math.max(maxLen, curLen);
            curLen = curI - preI;
        }
        preIndexs[c] = curI;
      }
      maxLen = Math.max(maxLen, curLen);
      return maxLen;
    }
}