class Solution {
    public boolean isPalindrome(int x) {
        while(x<0) return false;
        boolean flag=true;
        String str = String.valueOf(x);
        char[] arr=str.toCharArray() ;
        int len=arr.length;
        for(int i=0;i<len/2;i++){
            int j=len-i-1;
            if (arr[i]!=arr[j]) {
                flag=false;
                break;
            }
        }
        return flag;   
        
    }
}