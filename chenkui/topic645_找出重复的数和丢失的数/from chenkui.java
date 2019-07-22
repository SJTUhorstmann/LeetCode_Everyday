class Solution {
    
    //方法1
    /*
    public int[] findErrorNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[]{nums[i], i + 1};
            }
        }
        return null;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    */
    
    public int[] findErrorNums(int[] nums) {
        int[] arr=new int[2];
        int[] tem=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            tem[nums[i]-1]++;
        }
        for(int k=0;k<tem.length;k++){
            if(tem[k]==2){
                arr[0]=k+1;
            }
            if(tem[k]==0){
                arr[1]=k+1;
            }
        }
        return arr;

    }


}