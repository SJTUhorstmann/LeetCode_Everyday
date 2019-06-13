public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //移位加计数
        int count=0;
        for(int i=0;i<32;i++){
            if((n&1)==1)count++;
            n=n>>1;
        }
        return count;
    }
}

//类似上上面做法 将位移变为n/2,但是对于负数不成立！比如-3，二进制为11111111111111111111111111111101

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //移位加计数
        int count=0;
        while(n!=0){
            if(n%2==1)  count++;
            n=n/2;
        }
        return count;
    }
}