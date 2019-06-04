class Solution {
    public boolean isPalindrome(int x) {
        int a=0;
        int b=x;
        if(x==0){
            return true; 
        }
        else if(x>0){
            while(x!=0){
               a=a*10+x%10;
               x=x/10;
            }
            if(a==b){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            return false;
        }
        
    }
}