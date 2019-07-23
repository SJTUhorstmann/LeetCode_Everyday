import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    public int[] multiply(int[] A) {
        int n=A.length;
        int[] left=new int[n];
        int[] right=new int[n];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        int[] B=new int[n];
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*A[i-1];
            right[n-i-1]=right[n-i]*A[n-i];
        }
        for(int i=0;i<n;i++){
            B[i]=left[i]*right[i];
        }
        return B;
    }
}