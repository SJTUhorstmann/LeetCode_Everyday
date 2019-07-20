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
    
    
    //方法2
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
