//暴力法
class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int max=-1;
            for(int j=i+1;j<arr.length;j++){
                max=Math.max(arr[j],max);
            }
            arr[i]=max;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}

//使用额外数组空间dp[i]存储i位置右边最大元素
class Solution {
    public int[] replaceElements(int[] arr) {
        int[] dp=new int[arr.length-1];
        int max=-1;
        for(int i=arr.length-2;i>=0;i--){
            max=Math.max(max,arr[i+1]);
            dp[i]=max;
        }
        for(int i=0;i<arr.length-1;i++){
            arr[i]=dp[i];
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}