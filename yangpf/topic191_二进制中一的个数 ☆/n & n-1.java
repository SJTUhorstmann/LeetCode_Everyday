public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //������a, a = a & (a-1)�Ϳ���ȥ��a�����һ��1
        int count=0;
        while(n!=0){
            n&=n-1;
            count++;
        }
        return count;
    }
}