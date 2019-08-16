class Solution {
    public boolean judgeSquareSum(int c) {
        if(c<0) return false;
        int i=0,j=(int)Math.sqrt(c);
        while(i<=j){
            if(i*i>c-j*j){
                j--;
            }else if(i*i<c-j*j){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}