public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0)    return -1;
        boolean[] visit=new boolean[n];
        //��¼�������˶�Ӧ������
        int i=0;
        //��¼��һ�����ӵ���
        int index=0;
        //��¼���������
        int count=0;
        while(!allOut(visit)){
            while(visit[i]==true){
                i++;
                i=i%n;
            }
            count++;
            if(count==m){
                visit[i]=true;
                count=0;
                index=i;
            }
            i++;
            i=i%n;
        }
        return index;
    }
    public boolean allOut(boolean[] visit){
        for(boolean isOut:visit){
            if(isOut==false)    return false;
        }
        return true;
    }
}