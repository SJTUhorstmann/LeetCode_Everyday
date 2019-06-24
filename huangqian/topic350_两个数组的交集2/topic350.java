public static int[] intersect(int[] nums1, int[] nums2) {
    int l1=nums1.length;
    int l2=nums2.length;
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    List<Integer> list=new ArrayList<>();
    for(int i=0,j=0;i<l1&&j<l2;){
        if(nums1[i]>nums2[j]) j++;
        else if(nums1[i]<nums2[j]) i++;
        else {
            list.add(nums1[i]);
            i++;
            j++;
        }
    }
    int[] ans=new int[list.size()];
    for (int i=0;i<list.size();i++){
        ans[i]=list.get(i);
    }
    return ans;

}