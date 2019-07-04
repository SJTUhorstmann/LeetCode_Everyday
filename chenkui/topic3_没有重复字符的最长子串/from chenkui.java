class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] visited = new int[256];
        int curr_length = 1;
        int prev_index = 1;
        int max = 0;
        
        if (s.isEmpty()) {
            return 0;
        }
        
        visited[s.charAt(0)] = 1;
        for (int i = 1; i < s.length(); i++) {
            prev_index = visited[s.charAt(i)] - 1;
            if (prev_index == -1 || i - curr_length > prev_index) {
                curr_length++;
            } else {
                max = curr_length > max ? curr_length : max;
                curr_length = i - prev_index;
            }

           visited[s.charAt(i)] = i + 1;
        }
        max = curr_length > max ? curr_length : max;
        return max;
    }
}