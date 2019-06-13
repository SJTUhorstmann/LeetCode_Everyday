class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n<=1)    return n;
        int max=1;
        for(int i=0;i<n-1;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=i;j<n;j++){
                if(!set.add(s.charAt(j)))    break;
                max=Math.max(j-i+1,max);
            }
        }
        return max;
    }
}