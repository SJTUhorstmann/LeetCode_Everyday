public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0)    return -1;
        boolean[] visit=new boolean[n];
        //记录报数的人对应的索引
        int i=0;
        //记录上一个出队的人
        int index=0;
        //记录报数的序号
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