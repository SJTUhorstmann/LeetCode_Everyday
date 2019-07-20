import java.util.Arrays;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length==0)    return 0;
        if(array.length==1)    return array[0];
        int num=0;
        int temp=0;
        for(int i=0;i<array.length;i++){
            if(num==0){
                temp=array[i];
                num=1;
            }else{
                if(array[i]!=temp){
                    num--;
                }else{
                    num++;
                }
            }
        }
        int count=0;
        for(int v:array){
            if(v==temp)    count++;
        }
        if(count>array.length/2)    return temp;
        return 0;
    }
}