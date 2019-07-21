class Solution {
    
    // 方法1
   /* public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String st="";
        st=st+x;
        int left=0;
        int right=st.length()-1;
        while(left<right){
            char tem=st.charAt(left);
            char tem1=st.charAt(right);
            if(tem!=tem1){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }*/
    
    
class Solution {
    
    //方法1
    /*
    public int countBinarySubstrings(String s) {
        int preLen = 0;
        int curLen = 1;
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curLen++;
            } 
            else {
                preLen = curLen;
                curLen = 1;
            }

            if (preLen >= curLen) {
                count++;
            }
        }
        return count;
}*/
    
    //方法2
    public int countBinarySubstrings(String s) {
        int left = 1;
        int max = 0;
        int count = 0;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                left++;
            } 
            else {
                count=count+Math.min(max,left);
                max=left;
                left = 1;
                
            }

        }
        
        count=count+Math.min(max,left);
        return count;
}
}