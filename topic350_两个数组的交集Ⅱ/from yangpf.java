import java.util.ArrayList;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0,j=0;i<nums1.length && j<nums2.length;){
            if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j])    j++;
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] array=new int[list.size()];
        for(int i=0;i<array.length;i++){
            array[i]=list.get(i);
        }
        return array;
    }
}