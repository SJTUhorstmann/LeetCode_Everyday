class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        boolean[] arr=new boolean[n+1];
        int count=0;
        for(int i=2;i<n;i++){
            if(arr[i]){
                continue;
            }
            else{
            count++;
            for(long j=(long)i*i;j<n;j=j+i){
                arr[(int)j]=true;
            }
          }
        }
        return count;
    }
}class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        boolean[] arr=new boolean[n+1];
        int count=0;
        for(int i=2;i<n;i++){
            if(arr[i]){
                continue;
            }
            count++;
            for(long j=(long)i*i;j<n;j=j+i){
                arr[(int)j]=true;
            }
        }
        return count;
    }
}