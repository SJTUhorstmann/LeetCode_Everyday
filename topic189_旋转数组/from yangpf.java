class Solution {
    public void rotate(int[] nums, int k) {
        int length=nums.length;
        int[] array=new int[length*2];
        for(int i=0;i<array.length;i++){
            array[i]=nums[i%length];
        }
        k=k%length;
        for(int i=0;i<length;i++){
            nums[i]=array[i+length-k];
        }
    }
}
