class Solution {
    private int cnt = 0;
    public int countSubstrings(String s) {
        for(int i=0;i<s.length();i++){
            substring(s,i,i);
            substring(s,i,i+1);
        }
        return cnt;
    }
    public void substring(String s, int start, int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
            cnt++;
        }
    }
}