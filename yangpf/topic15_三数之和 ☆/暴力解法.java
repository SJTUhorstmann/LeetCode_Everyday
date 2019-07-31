// 只通过了 311/313
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        if(nums.length<3)   return res;
        for(int i=0;i<nums.length-2;i++){
            //List<Integer> list=new ArrayList<Integer>();
            for(int j=i+1;j<nums.length-1;j++){
                List<Integer> list=new ArrayList<Integer>();
                if(!twoSum(nums,j,-nums[i]).isEmpty()){
                    list.add(nums[i]);
                    list.addAll(twoSum(nums,j,-nums[i]));
                    if(!res.contains(list)) res.add(list);
                }
            }
        }
        return res;
    }
    public List<Integer> twoSum(int[] nums,int start,int target){
        List<Integer> list=new ArrayList<Integer>();
        for(int i=start+1;i<nums.length;i++){
            if(nums[start]+nums[i]==target){
                list.add(nums[start]);
                list.add(nums[i]);
                return list;
            }
        }
        return list;
    }
}