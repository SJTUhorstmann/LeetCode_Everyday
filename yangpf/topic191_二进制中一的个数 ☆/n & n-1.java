public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //对于数a, a = a & (a-1)就可以去除a的最后一个1
        int count=0;
        while(n!=0){
            n&=n-1;
            count++;
        }
        return count;
    }
}