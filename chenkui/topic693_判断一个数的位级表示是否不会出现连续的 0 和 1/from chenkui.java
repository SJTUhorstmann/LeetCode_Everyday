class Solution {

    public boolean hasAlternatingBits(int n) {
        int tem= (n ^ (n >> 1));
        int tem1=tem & (tem + 1);
        
        if(tem1==0){
            return true;
         }
        else{
           return false;
        }

    }
    
}