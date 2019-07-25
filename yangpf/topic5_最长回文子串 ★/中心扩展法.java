class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()==0)    return s;
        int max=1;
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++){
            int len1=getMax(s,i,i);
            int len2=getMax(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>max){
                max=len;
                left=i-(max-1)/2;
                right=i+max/2;
            }
        }
        return s.substring(left,right+1);
    }
    public int getMax(String s,int i,int j){
        int left=i,right=j;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}