class Solution {
    public boolean judgeSquareSum(int c) {
      int i=0;
      int j=(int)Math.sqrt(c);
      while(i<=j){
        int tem=i*i+j*j;
        if(tem==c) return true;
        else if(tem>c){
          j--;
        }
        else{
          i++;
        }
      }
      return false;
        
    }
}