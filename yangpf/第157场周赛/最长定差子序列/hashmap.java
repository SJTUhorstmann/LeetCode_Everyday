class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int n=arr.length;
        int res=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=n-1;i>=0;i--){
            int val=arr[i]+difference;
            if(!map.containsKey(val)){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(val)+1);
            }
            res=Math.max(res,map.get(arr[i]));
        }
        return res;
    }
}