import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        if(input==null || k==0 || input.length<k )    return res;
        quickSort(input,0,input.length-1);
        
        for(int i=0;i<k;i++){
            res.add(input[i]);
        }
        return res;
    }
    public void quickSort(int[] array,int start,int end){
        if(start>=end)    return;
        int index=partition(array,start,end);
        quickSort(array,start,index-1);
        quickSort(array,index+1,end);
    }
    //返回一个索引index
    public int partition(int[] array,int start,int end){
        int target=array[start];
        int i=start+1;
        int j=end;
        while(i<j){
            while(i<j && array[j]>target){
                j--;
            }
            while(i<j && array[i]<=target){
                i++;
            }
            swap(array,i,j);
        }
        swap(array,start,j);
        return j;
    }
    public void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}