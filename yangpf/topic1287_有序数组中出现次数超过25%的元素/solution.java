class Solution {
    public int findSpecialInteger(int[] arr) {
        int len=arr.length;
        for(int i=0;i<len-len/4;i++){
            if(arr[i]==arr[i+len/4]){
                return arr[i];
            }
        }
        return -1;
    }
}