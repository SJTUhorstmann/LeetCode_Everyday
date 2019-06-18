class Solution {
    public boolean canJump(int[] nums) {
        boolean[] flag=new boolean[nums.length];
        flag[nums.length-1]=true;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]==0)  flag[i]=false;
            else{
                boolean tag=false;
                for(int j=Math.min(i+nums[i],nums.length-1);j>i;j--){
                    tag=tag || flag[j];
                }
                flag[i]=tag;
            }
        }
        return flag[0];
    }
}