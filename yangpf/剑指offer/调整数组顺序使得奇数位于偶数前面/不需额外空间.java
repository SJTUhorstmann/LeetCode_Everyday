public class Solution {
    public void reOrderArray(int [] array) {
        int n=array.length/2;
        while(n-->0){
            for(int i=0;i<array.length-1;i++){
                if(array[i]%2==0 && array[i+1]%2==1){
                    swap(array,i,i+1);
                }
            }
        }
    }
    public void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}