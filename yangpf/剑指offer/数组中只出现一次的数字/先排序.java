//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
//��num1[0],num2[0]����Ϊ���ؽ��
import java.util.Arrays;
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Arrays.sort(array);
        int[] num=new int[2];
        int index=0;
        for(int i=0;i<array.length;i=i+2){
            if(i==array.length-1 || array[i]!=array[i+1]){
                num[index++]=array[i];
                i--;
                if(index==2)    break;
            }
        }
        num1[0]=num[0];
        num2[0]=num[1];
    }
}