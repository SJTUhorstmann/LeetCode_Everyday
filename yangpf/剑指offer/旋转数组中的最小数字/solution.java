//时间复杂度为O(n)解法
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        for(int i=1;i<array.length;i++){
            if(array[i]<array[i-1])    return array[i];
        }
        return array[0];
    }
}