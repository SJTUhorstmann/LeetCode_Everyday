public class shuzu {
    //�ϲ�������������
    // ����Ҫ�½����飬nums1�Ӻ���ǰ��
    //���nums1�����ˣ�����Ҫ��nums2����ʣ�µķŽ���
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[index--] = nums1[i--];
            } else {
                nums1[index--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[index--] = nums2[j--];
        }
    }
}