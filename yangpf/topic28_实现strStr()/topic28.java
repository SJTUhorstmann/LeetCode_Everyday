class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        if(m<n) return -1;
        for(int i=0;i<=m-n;i++){
            String s=haystack.substring(i,i+n);
            if(!isEqual(s,needle))    continue;
            return i;
        }
        return -1;
    }
    public boolean isEqual(String s1,String s2){
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i))  return false;
        }
        return true;
    }
}