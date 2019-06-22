import java.util.HashSet;
import java.util.Set;

public class Solution421 {
    public int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        // test each bit pose, �ж��ܲ��ܹ�������Ҫ��ֵ��
        for(int i = 31; i >= 0; i --) {
            // ÿ�ζ���֮ǰ�Ļ����ϸ���mask
            mask = mask | (1 << i);
            Set<Integer> set = new HashSet<>();
            for(int num : nums) {
                // add the number which has the mask as its prefix;
                set.add(num & mask);
            }
            // ���赱ǰ���ܴﵽ�����ֵ�����tempֵ��
            int tmp = max | (1 << i);
            for(Integer prefix : set) {
                if(set.contains(prefix ^ tmp)) {
                    // �������ɾ�ֱ��break
                    max = tmp;
                    break;
                }
            }
        }
        return max;
    }
}