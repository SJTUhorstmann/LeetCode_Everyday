public class Solution458 {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int b=minutesToTest/minutesToDie+1;//һ���ж�����״̬
        int k=0,n=1;//k��ʾ���������n��ʾkͷ����ܵ�״̬��
        while (n<buckets){
            k++;
            n*=b;
        }
        return k;
    }
} 