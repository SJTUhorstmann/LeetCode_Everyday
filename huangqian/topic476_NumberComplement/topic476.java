class Solution {
    public int findComplement(int num) {
        int res=0,t=0;//t��ʾ��ǰö�ٵ��ڼ�λ
        //ȡ����ı����λ
        while(num!=0){
            int a = num%2==0?1:0;
            res += a<<t++;
            // ��λ�����ֻ���ؽ������ԭ���޸�
            num = num>>1;
        }
        return res;       
    }
}