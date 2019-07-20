public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<array.length;i++){
            if(sum<0){
                sum=0;
            }
            sum+=array[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}