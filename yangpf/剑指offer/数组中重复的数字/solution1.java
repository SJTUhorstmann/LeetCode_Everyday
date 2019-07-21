public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    ����Ҫ�ر�ע��~���������ظ���һ������ֵduplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(length==0){
            duplication[0]=-1;
            return false;
        }
        boolean[] arr=new boolean[numbers.length];
        for(int i=0;i<numbers.length;i++){
            if(arr[numbers[i]]==true){
                duplication[0]=numbers[i];
                return true;
            }
            arr[numbers[i]]=true;
        }
        duplication[0]=-1;
        return false;
    }
}