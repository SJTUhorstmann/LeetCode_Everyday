import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]>sum)    break;
                if(array[i]+array[j]==sum){
                    list.add(array[i]);
                    list.add(array[j]);
                    min=Math.min(min,array[i]*array[j]);
                    break;
                }
            }
        }
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<list.size();i=i+2){
            if(list.get(i)*list.get(i+1)==min){
                res.add(list.get(i));
                res.add(list.get(i+1));
                return res;
            }
        }
        return res;
    }
}