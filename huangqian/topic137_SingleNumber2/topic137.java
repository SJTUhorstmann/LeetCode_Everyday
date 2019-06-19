public class Solution137 {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int bit=0;bit<32;bit++){
            int count=0;
            for(int i=0;i<nums.length;i++) count+=(nums[i]>>bit)&1;
            ans+=(count%3)<<bit;
        }
        return ans;
    }
}