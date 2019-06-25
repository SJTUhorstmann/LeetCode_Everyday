// test case 25/26
class Solution {
    public int longestSubstring(String s, int k) {
        int n=s.length();
        if(k<=1)    return n;
        int len=n-1;
        while(len>=k-1){
            for(int i=0;i<n-len;i++){
                String T=s.substring(i,i+len+1);
                if(helper(T,k))   return len+1;
            }
            len--;
        }
        return 0;
    }
    public boolean helper(String s,int k){
        int[] array=new int[26];
        for(int i=0;i<s.length();i++){
            array[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(array[i]!=0 && array[i]<k)  return false;
        }
        return true;
    }
}