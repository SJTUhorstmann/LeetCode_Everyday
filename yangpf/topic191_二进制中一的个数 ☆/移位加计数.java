public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //��λ�Ӽ���
        int count=0;
        for(int i=0;i<32;i++){
            if((n&1)==1)count++;
            n=n>>1;
        }
        return count;
    }
}

//�������������� ��λ�Ʊ�Ϊn/2,���Ƕ��ڸ���������������-3��������Ϊ11111111111111111111111111111101

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //��λ�Ӽ���
        int count=0;
        while(n!=0){
            if(n%2==1)  count++;
            n=n/2;
        }
        return count;
    }
}