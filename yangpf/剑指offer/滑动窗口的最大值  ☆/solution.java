//时间复杂度太高，需要增加O（n）解法
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res=new ArrayList<Integer>();
        if(size==0 || size>num.length)    return res;
        for(int i=0;i<num.length-size+1;i++){
            res.add(getMax(num,i,size));
        }
        return res;
    }
    public int getMax(int[] num,int start,int size){
        int max=Integer.MIN_VALUE;
        for(int i=start;i<size+start;i++){
            max=Math.max(max,num[i]);
        }
        return max;
    }
}