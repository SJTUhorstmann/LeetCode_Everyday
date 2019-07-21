import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        int i=0,j=array.length-1;
        while(i<j){
            if(array[i]+array[j]==sum){
                res.add(array[i]);
                res.add(array[j]);
                break;
            }
            while(i<j && array[i]+array[j]>sum)    --j;
            while(i<j && array[i]+array[j]<sum)    ++i;
        }
        return res;
    }
}