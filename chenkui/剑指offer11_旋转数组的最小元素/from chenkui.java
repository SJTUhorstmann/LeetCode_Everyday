import java.util.ArrayList;
public class Main {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0){
            return 0;
        }
        int l=0;
        int r=array.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(array[mid]<=array[r]){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return array[l];
    }
}

