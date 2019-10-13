import java.util.Arrays;
public class Solution {
    int count=0;
    int mod=1000000007;
    public int InversePairs(int [] array) {
        mergeSort(array,0,array.length-1);
        return count%mod;
    }
    public void mergeSort(int[] array,int start,int end){
        if(start>=end)    return;
        int mid=(end-start)/2+start;
        mergeSort(array,start,mid);
        mergeSort(array,mid+1,end);
        merge(array,start,mid,end);
    }
    public void merge(int[] array,int start,int mid,int end){
        int[] aux=new int[end-start+1];
        for(int i=0;i<aux.length;i++){
            aux[i]=array[i+start];
        }
        int i=start,j=mid+1,k=start;
        while(k<=end){
            if(i>mid){
                array[k]=aux[j-start];
                j++;
            }else if(j>end){
                array[k]=aux[i-start];
                i++;
            }else if(aux[i-start]<=aux[j-start]){
                array[k]=aux[i-start];
                i++;
            }else{
                array[k]=aux[j-start];
                j++;
                count+=mid-i+1;
                count=count%mod;
            }
            k++;
        }
    }
}