class Solution {
    public boolean isPowerOfFour(int num) {
        if(num<=0){
            return false;
        }
        
        int tem=num & (num - 1);
        int tem1=num & 0b01010101010101010101010101010101;
        
        if(tem==0 && tem1!=0){
            return true;
        }
        else{
            return false;
        }

    }
}