class Solution {
    public char findTheDifference(String s, String t) {
        int res=0;
        for(int i=0;i<s.length();i++){
            res=res^(s.charAt(i)-'a');
        }
        for(int j=0;j<t.length();j++){
            res=res^(t.charAt(j)-'a');
        }
        return (char)('a'+res);
    }
}