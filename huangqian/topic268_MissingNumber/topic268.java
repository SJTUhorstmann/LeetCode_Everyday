import java.util.Arrays;
public class Solution268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i) {
                res=nums[i]-1;
                break;
            }else {
                res=nums[i]+1;//����[0,1]ʱ���2
            }
        }
        return res;
    }
}