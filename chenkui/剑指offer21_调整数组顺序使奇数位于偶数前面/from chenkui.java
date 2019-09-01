public class Main {
    public void reOrderArray(int [] array) {
        int[] arr=new int[array.length];
        int count=0;
        int count1=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                arr[count++]=array[i];
            }
            else{
                array[count1++]=array[i];
            }
        }
        for(int i=0;i<count;i++){
            array[i+count1]=arr[i];
        }
    }
}