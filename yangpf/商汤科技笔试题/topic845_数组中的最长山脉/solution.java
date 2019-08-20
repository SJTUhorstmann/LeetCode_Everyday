class Solution {
    public int longestMountain(int[] A) {
        if(A.length<3)  return 0;
        int max=0;
        for(int i=1;i<A.length-1;i++){
            if(A[i]>A[i-1] && A[i]>A[i+1]){
                max=Math.max(max,getShanMaiLength(A,i));
            }
        }
        return max<3?0:max;
    }
    //以数组A中i索引位置作为山峰得到的最长山脉的长度
    public int getShanMaiLength(int[] A,int i){
        int left=i-1;
        int right=i+1;
        int N=A.length;
        while(left>0 && A[left-1]<A[left])    left--;
        while(right<N-1 && A[right+1]<A[right]) right++;
        return right-left+1;
    }
}