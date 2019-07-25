class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        
        int tem=n&(n-1);
        if(tem==0){
            return true;
        }
        else{
            return false;
        }
}
}