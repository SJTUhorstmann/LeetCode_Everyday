class Solution {
    public int findComplement(int num) {
        if (num == 0){
           return 1;
        }
        
        int tem= 1 << 30;
        while ((num & tem) == 0){
           tem >>= 1; 
        } 
        
        tem = (tem << 1) - 1;
        return num ^ tem;
    }
}