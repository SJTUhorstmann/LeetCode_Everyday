import java.util.ArrayList;
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n<=0)    return -1;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        int i=0;
        int count=0;
        while(list.size()!=1){
            if(count==m-1){
                list.remove(i);
                count=0;
            }else{
                i++;
                i=i%list.size();
                count++;
            }
        }
        return list.get(0);
    }
}