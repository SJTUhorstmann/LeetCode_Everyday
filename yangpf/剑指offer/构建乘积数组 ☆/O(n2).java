import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    public int[] multiply(int[] A) {
        int[] B=new int[A.length];
        Arrays.fill(B,1);
        int n=A.length;
        for(int i=1;i<n;i++){
            B[0]*=A[i];
            B[n-1]*=A[i-1];
        }
        for(int i=1;i<n-1;i++){
            for(int j=0;j<n;j++){
                if(i==j)    continue;
                B[i]*=A[j];
            }
        }
        return B;
    }
}