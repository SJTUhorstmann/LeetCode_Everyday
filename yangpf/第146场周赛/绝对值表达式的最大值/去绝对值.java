//暴力解法会超时
class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int n=arr1.length;
        // 
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        int[] dp3=new int[n];
        int[] dp4=new int[n];
        for(int i=0;i<n;i++){
            dp1[i]=arr1[i]+arr2[i]-i;
            dp2[i]=arr1[i]-arr2[i]-i;
            dp3[i]=-arr1[i]+arr2[i]-i;
            dp4[i]=-arr1[i]-arr2[i]-i;
        }
        int min1=getMin(dp1);
        int max1=getMax(dp1);
        int min2=getMin(dp2);
        int max2=getMax(dp2);
        int min3=getMin(dp3);
        int max3=getMax(dp3);
        int min4=getMin(dp4);
        int max4=getMax(dp4);
        return Math.max(Math.max(max1-min1,max2-min2),Math.max(max3-min3,max4-min4));
    }
    public int getMin(int[] array){
        int min=Integer.MAX_VALUE;
        for(int i:array){
            min=Math.min(min,i);
        }
        return min;
    }
    public int getMax(int[] array){
        int max=Integer.MIN_VALUE;
        for(int i:array){
            max=Math.max(max,i);
        }
        return max;
    }
}