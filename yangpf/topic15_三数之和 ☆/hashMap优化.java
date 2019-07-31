//速度有点慢  只击败了5%
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length-2;i++){
            while (i > 0 && i < nums.length -2 && nums[i] == nums[i-1]) i++;
            for(int j=i+1;j<nums.length-1;j++){
                while (j > i+1 && j < nums.length - 1 && nums[j] == nums[j-1]) j++;
                if(map.containsKey(-nums[i]-nums[j]) && map.get(-nums[i]-nums[j]) >j){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(-nums[i]-nums[j]);
                    if(!res.contains(list)) res.add(list);
                }
            }
        }
        return res;
    }
}