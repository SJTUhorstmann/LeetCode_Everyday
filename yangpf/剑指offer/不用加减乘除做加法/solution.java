//v1��ʾ������λ�ļӷ���v2��ʾ��λ�� ������ڶ�����ӣ��ݹ���ø÷���
public class Solution {
    public int Add(int num1,int num2) {
        if(num1==0)    return num2;
        if(num2==0)    return num1;
        int v1=num1^num2;
        int v2=(num1&num2)<<1;
        return Add(v1,v2);
    }
}