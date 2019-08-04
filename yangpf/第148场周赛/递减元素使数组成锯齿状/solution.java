class Solution {
    public int movesToMakeZigzag(int[] nums) {
        if(nums.length==0)  return 0;
        //偶数索引大于相邻元素
        int max1=0;
        //奇数索引
        int max2=0;
        int[] nums1=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums1[i]=nums[i];
        }
        for(int i=1;i<nums.length;i=i+2){
            int diff1=0;
            if(nums1[i-1]-nums1[i]+1>=0){
                diff1=nums1[i-1]-nums1[i]+1;
                nums1[i-1]=nums[i]-1;
            }
            int diff2=0;
            if(i!=nums.length-1){
                if(nums1[i+1]-nums1[i]+1>=0){
                    diff2=nums1[i+1]-nums1[i]+1;
                    nums1[i+1]=nums[i]-1;
                }
            }
            max2+=diff1+diff2;
        }
        for(int i=0;i<nums.length;i=i+2){
            int diff1=0;
            if(i!=0){
                if(nums[i-1]-nums[i]+1>=0){
                    diff1=nums[i-1]-nums[i]+1;
                    nums[i-1]=nums[i]-1;
                }
            }
            int diff2=0;
            if(i!=nums.length-1){
                 if(nums[i+1]-nums[i]+1>=0){
                    diff2=nums[i+1]-nums[i]+1;
                    nums[i+1]=nums[i]-1;
                }
            }
            max1+=diff1+diff2;
        }
        return Math.min(max1,max2);
    }
}