class Solution {
    public int heightChecker(int[] heights) {
        int[] arr=new int[heights.length];
        arr=Arrays.copyOf(heights,heights.length);
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=arr[i])  count++;
        }
        return count;
    }
}