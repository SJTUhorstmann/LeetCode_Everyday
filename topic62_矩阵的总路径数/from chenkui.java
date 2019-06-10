class Solution {
    public int uniquePaths(int m, int n) {
      if(m<1 || n<1) 
        return 0;
      else if(m==1 || n==1) 
        return 1;
      else{
        int tem1=factorial(m,n);
        return tem1;
      }
    }
  
   public int factorial(int m,int n){
      long result=1;
      int S = m + n - 2;  
      int D = m - 1;      
      for (int i = 1; i <= D; i++) {
          result = result * (S - D + i) / i;
      }
     return (int)result;
   } 
}