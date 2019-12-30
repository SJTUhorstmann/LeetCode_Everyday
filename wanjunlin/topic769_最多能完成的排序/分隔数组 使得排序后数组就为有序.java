class Solution {
    public int maxChunksToSorted(int[] arr) {
        if(arr==null){
            return 0;
        }
        int ret = 0;
        int right = arr[0];
        for(int i=0;i<arr.length;i++){
            right = Math.max(right,arr[i]);
            if(right==i){
                ret++;
            }
        }
        return ret;
    }
}