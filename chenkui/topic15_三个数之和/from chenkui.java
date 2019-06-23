class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> list=new ArrayList<>();
      Arrays.sort(nums);
      for(int i=0;i<nums.length-2;i++){
        if(i>0 && nums[i]==nums[i-1]){
          continue;
        }
        int l=i+1;
        int r=nums.length-1;
        int tem=-nums[i];
        while(l<r){
          if(nums[l]+nums[r]==tem){
            List<Integer> list1=new ArrayList<Integer>();
            list1.add(nums[i]);
            list1.add(nums[l]);
            list1.add(nums[r]);
            list.add(list1);
            l++;
            r--;
            while(l<r && nums[l]==nums[l-1]){
              l++;
            }
             while(l<r && nums[r]==nums[r+1]){
              r--;
            }
          }
          else if(nums[l]+nums[r]>tem){
            r--;
          }
          else{
            l++;
          }
        }
      
    }
      return list;
}
}