public class Solution {
    public void reOrderArray(int [] array) {
        //int[] temp=Arrays.copyOf(array,array.length);
        int[] temp=array.clone();
        int index=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]%2==1)    array[index++]=temp[i];
        }
        for(int i=0;i<temp.length;i++){
            if(temp[i]%2==0)    array[index++]=temp[i];
        }
    }
}