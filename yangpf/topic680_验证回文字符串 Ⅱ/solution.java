class Solution {
    public boolean validPalindrome(String s) {
        char[] arr=s.toCharArray();
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(arr[i]!=arr[j]){
                return isPalindrome(arr,i+1,j) || isPalindrome(arr,i,j-1);
            }
        }
        return true;
    }
    public boolean isPalindrome(char[] arr,int start,int end){
        int i=start,j=end;
        while(i<j){
            if(arr[i]!=arr[j])    return false;
            i++;
            j--;
        }
        return true;
    }
}

//注意上面的解法比下面的解法要快
class Solution {
    public boolean validPalindrome(String s) {
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
        }
        return true;
    }
    public boolean isPalindrome(String s,int start,int end){
        int i=start,j=end;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))    return false;
            i++;
            j--;
        }
        return true;
    }
}