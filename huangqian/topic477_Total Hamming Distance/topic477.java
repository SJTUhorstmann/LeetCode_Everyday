public class Solution477 {
    public int totalHammingDistance(int[] nums) {
        int res=0;
        for(int i=0;i<32;i++){
            int ones=0;
            for(int x:nums) {
                ones += (x>>i) & 0x1;
            }
            res += ones*(nums.length-ones);
        }
        return res;
    }
}
