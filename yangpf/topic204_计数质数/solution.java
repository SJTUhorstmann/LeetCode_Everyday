class Solution {
    public int countPrimes(int n) {
        int count=0;
        for(int i=2;i<n;i++){
            if(isZhiShu(i)) count++;
        }
        return count;
    }
    public boolean isZhiShu(int n){
        if(n==2)    return true;
        if(n==1 || n%2==0)    return false;
        for(int i=3;i<=Math.sqrt(n);i=i+2){
            if(n%i==0)  return false;
        }
        return true;
    }
}