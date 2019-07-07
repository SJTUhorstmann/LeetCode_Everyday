import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int low=0,high=array.length-1;
        int mid=(low+high)/2;
        while(low!=mid){
            if(array[mid]>=array[low] && array[mid]>=array[high]){
                low=mid;
            }else if(array[mid]<=array[low] && array[mid]<=array[high]){
                high=mid;
            }
            mid=(low+high)/2;
        }
        return array[high];
    }
}