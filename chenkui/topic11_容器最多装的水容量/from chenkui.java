class Solution {
    public int maxArea(int[] height) {
      int max=0;
      for(int i=1;i<height.length;i++){
        int right=height[i];
        int left=height[0];
        int cur=Math.min(left,right)*i;
        for(int j=0;j<i;j++){
          if(height[j]>left && Math.min(height[j],right)*(i-j)>cur){
            cur=Math.min(height[j],right)*(i-j);
            left=height[j];
          }
        }
        max=Math.max(max,cur);
      }
      return max;
    }
}