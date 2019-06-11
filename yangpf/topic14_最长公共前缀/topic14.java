class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen=Integer.MAX_VALUE;
        if(strs.length==0)  return "";
        for(String s:strs){
            minLen=Math.min(minLen,s.length());
        }
        for(int i=minLen;i>=1;i--){
            String s=strs[0].substring(0,i);
            int j=0;
            for(j=0;j<strs.length;j++){
                if(!isEqual(s,strs[j])) break;
            }
            if(j==strs.length)    return s;
        }
        return "";
    }
    public boolean isEqual(String s1,String s2){
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i))  return false;
        }
        return true;
    }
}