˼·��
���ӣ�https://www.nowcoder.com/questionTerminal/e02fdb54d7524710a7d664d082bb7811
��Դ��ţ����


���ȣ�λ�������������ʣ�������ͬ�������=0��һ������0�����������

��ֻ��һ��������һ��ʱ�����ǰ����������е���������������㣬���ʣ�µľ����䵥��������Ϊ�ɶԶ����ֵĶ������ˡ�

�������˼·���������������������Ǽ�����AB������һ�ε����顣�������Ȼ��������ʣ�µ����ֿ϶���A��B���Ľ�����������Ķ������е�1�����ֵ���A��B�Ĳ�ͬ��λ�����Ǿ�ȡ��һ��1���ڵ�λ���������ǵ�3λ�����Ű�ԭ����ֳ����飬�����׼�ǵ�3λ�Ƿ�Ϊ1����ˣ���ͬ�����϶���һ���飬��Ϊ��ͬ��������λ����ͬ������ͬ�������϶�����һ�顣Ȼ����������鰴���ʼ��˼·���������ʣ��������������������ֻ����һ�ε����֡�

//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
//��num1[0],num2[0]����Ϊ���ؽ��
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int value=0;
        for(int v:array){
            value^=v;
        }
        int index=0;
        while(value!=0){
            if(value%2==1){
                break;
            }
            value=value/2;
            index++;
        }
        int[] arr1=new int[array.length];
        int[] arr2=new int[array.length];
        int index1=0;
        int index2=0;
        for(int i=0;i<array.length;i++){
            if(indexIsOne(array[i],index))    arr1[index1++]=array[i];
            else    arr2[index2++]=array[i];
        }
        for(int v:arr1){
            num1[0]^=v;
        }
        for(int v:arr2){
            num2[0]^=v;
        }
    }
    public boolean indexIsOne(int num,int index){
        while(index-->0){
            num=num/2;
        }
        if(num%2==1)    return true;
        return false;
    }
}