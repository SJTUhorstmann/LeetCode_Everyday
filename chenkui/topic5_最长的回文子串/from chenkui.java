class Solution {
    public String longestPalindrome(String s) {
       if ("".equals(s)) {
       return s;
    }
    int len = s.length();
    boolean[][] arr = new boolean[len][len];
    int left = 0, right = 0;
    for (int i = len - 2; i >= 0; i--) {
       arr[i][i] = true;
       for (int j = i + 1; j < len; j++) {
           arr[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || arr[i + 1][j - 1]);
           if (arr[i][j] && right - left < j - i) {
              left = i;
              right = j;
           }
       }
    }
    return s.substring(left, right + 1);
}
}