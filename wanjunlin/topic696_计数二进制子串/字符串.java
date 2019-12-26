class Solution {
    public int countBinarySubstrings(String s) {
        int preLen = 0, curLen = 1, cnt = 0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                curLen++;
            }else{
                preLen = curLen;
                curLen = 1;
            }
            if(preLen>=curLen){
                cnt++;
            }
        }
        return cnt;
    }
}