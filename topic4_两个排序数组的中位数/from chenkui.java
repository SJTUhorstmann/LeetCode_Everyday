class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums2.length < nums1.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        
        int totalLength = nums1.length + nums2.length;
        int start = 0;
        int end = nums1.length;
        
        while (start <= end) {
            int mid1 = (start + end) / 2;
            int mid2 = (totalLength + 1) / 2 - mid1;
            int nums1Left = (mid1 > 0) ? nums1[mid1 - 1] : Integer.MIN_VALUE;
            int nums2Left = (mid2 > 0) ? nums2[mid2 - 1] : Integer.MIN_VALUE;
            int nums1Right = (mid1 < nums1.length) ? nums1[mid1] : Integer.MAX_VALUE;
            int nums2Right = (mid2 < nums2.length) ? nums2[mid2] : Integer.MAX_VALUE;
            
            if (nums1Left > nums2Right)
                end = mid1;
            else if (nums2Left > nums1Right)
                start = mid1 + 1;
            else {
                if (totalLength % 2 == 0)
                    return (Math.max(nums1Left, nums2Left) + Math.min(nums1Right, nums2Right)) / 2.0;
                else
                    return Math.max(nums1Left, nums2Left);
            }
        }
        
        return 0;
    }
}