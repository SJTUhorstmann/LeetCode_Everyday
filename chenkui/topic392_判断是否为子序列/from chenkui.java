class Solution {
    public boolean isSubsequence(String s, String t) {
      if(s.length()>t.length()) return false;
      int l=0;
      int r=0;
      while(l<s.length() && r<t.length()){
        if(s.length()-l>t.length()-r) return false;
        if(s.charAt(l)==t.charAt(r)){
          l++;
        }
        r++;
      }
      return (l==s.length())? true:false;
    }
}