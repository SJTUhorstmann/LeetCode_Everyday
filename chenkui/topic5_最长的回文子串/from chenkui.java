class Solution {
    int maxLen=0;
    int left=0;
    
    public String longestPalindrome(String s) {
      int len=s.length();
      if(len<2) return s;
      for(int i=0;i<len-1;i++){
        Palindrome(s,i,i);
        Palindrome(s,i,i+1);
      }
      
      return s.substring(left,left+maxLen);
    }
    public void Palindrome(String s,int begin,int end){
       while(begin>=0 && end <s.length() && s.charAt(begin)==s.charAt(end)){
        begin--;
        end++;
      }
      if(maxLen<end-begin-1){
        left=begin+1;
        maxLen=end-begin-1;
      }
      
    }
   
}