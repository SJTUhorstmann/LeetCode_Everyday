class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
            arr1[i]=max;
            min=Math.min(min,arr[n-i-1]);
            arr2[n-i-1]=min;
        }
        int res=0;
        for(int i=0;i<n-1;i++){
            if(arr1[i]<=arr2[i+1]){
                res++;
            }
        }
        return res+1;
    }
}