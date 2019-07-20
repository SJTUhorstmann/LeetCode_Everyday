import java.util.Arrays;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length==0)    return 0;
        if(array.length==1)    return array[0];
        Arrays.sort(array);
        for(int i=0;i<array.length/2;i++){
            if(array[i]==array[i+array.length/2])    return array[i];
        }
        return 0;
    }
}