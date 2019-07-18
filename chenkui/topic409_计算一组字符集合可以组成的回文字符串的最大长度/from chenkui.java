class Solution {
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        
        int[] arr=new int[256];
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch]++;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]>0){
                count=count+2*(arr[j]/2);
            }
        }
        if(count<s.length()){
            count++;
        }
        return count;
         
    }
}