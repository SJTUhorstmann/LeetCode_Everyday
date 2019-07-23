import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
       for(int i=1;i<=sum/2;i++){
           int num=2;
           while(getSum(i,num)<sum){
               num++;
           }
           if(getSum(i,num)==sum){
               ArrayList<Integer> list=new ArrayList<Integer>();
               int start=i;
               while(num-->0){
                   list.add(start++);
               }
               res.add(list);
           }
       }
        return res;
    }
    //��ȡ��start���ֿ�ʼ��num�����������ĺ�
    public int getSum(int start,int num){
        int sum=0;
        while(num-->0){
            sum+=start;
            start++;
        }
        return sum;
        //����ֱ��return ֵ
        //return (start*2+num-1)*num/2;  
    }
}