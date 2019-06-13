class Solution {
    public int integerBreak(int n) {
      if(n<2) return 0;
      if(n==2) return 1;
      if(n==3) return 2;
      
      int[] arr=new int[n+1];
      arr[2]=1;
      arr[3]=2;
      
      for(int i=4;i<=n;i++){
        for(int j=1;j<i;j++){
          arr[i]=Math.max(arr[i],Math.max(arr[j]*(i-j),j*(i-j)));
        }
      }
      return arr[n];
    }
}