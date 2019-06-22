import java.util.HashSet;
import java.util.Set;

public class Solution421 {
    public int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        // test each bit pose, 判断能不能构成所需要的值；
        for(int i = 31; i >= 0; i --) {
            // 每次都在之前的基础上更新mask
            mask = mask | (1 << i);
            Set<Integer> set = new HashSet<>();
            for(int num : nums) {
                // add the number which has the mask as its prefix;
                set.add(num & mask);
            }
            // 假设当前所能达到的最大值是这个temp值；
            int tmp = max | (1 << i);
            for(Integer prefix : set) {
                if(set.contains(prefix ^ tmp)) {
                    // 如果能组成就直接break
                    max = tmp;
                    break;
                }
            }
        }
        return max;
    }
}