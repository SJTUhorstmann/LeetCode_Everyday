//ֻ��������Ч
public class Solution {
    public int NumberOf1(int n) {
        int num=0;
        while(n!=0){
            if(n%2!=0)    num++;
            n=n/2;
        }
        return num;
    }
}

//����������ѭ������Ϊ��������ʱ�������λ������1
public class Solution {
    public int NumberOf1(int n) {
        int num=0;
        while(n!=0){
            if(n%2!=0)    num++;
            n=n>>1;
        }
        return num;
    }
}

//ʹ��1������ÿһλ����������
public class Solution {
    public int NumberOf1(int n) {
        int flag=1;
        int num=0;
        while(flag!=0){
            //ע������ط�n&flag���������
            if((n&flag)!=0)    num++;
            flag=flag<<1;
        }
        return num;
    }
}