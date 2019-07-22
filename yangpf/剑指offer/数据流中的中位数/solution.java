//时间复杂度太高，需要增加 avl树解法或者堆解法

import java.util.LinkedList;
public class Solution {
    LinkedList<Integer> list=new LinkedList<>();
    public void Insert(Integer num) {
        if(list.isEmpty())    list.add(num);
        else{
            for(int i=0;i<list.size();i++){
                if(num<=list.get(i)){
                    list.add(i,num);
                    return;
                }
            }
            list.add(list.size(),num);
        }
    }

    public Double GetMedian() {
        int size=list.size();
        if(size%2==1){
            return (double)list.get(size/2);
        }else{
            return (double)(list.get(size/2-1)+list.get(size/2))/2;
        }
    }


}