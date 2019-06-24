class Solution {
    public void rotate(int[] nums, int k) {
        for (int i=1;i<=k;i++){
            rotate1(nums);
        }
    }
    public void rotate1(int[] nums){        
        int len=nums.length;
        int temp=0;
        temp=nums[len-1];
        for (int i=len-1;i>0;i--){
            nums[i]=nums[i-1];
        }
        nums[0]=temp;
    }
    }