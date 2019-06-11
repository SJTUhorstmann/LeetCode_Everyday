import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int[] array={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                array[0]=map.get(target-nums[i]);
                array[1]=i;
                return array;
            }
            map.put(nums[i],i);
        }
        return array;
    }
}

//暴力解法
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        if(n<=1 || nums==null)  return null;
        int[] res=new int[2];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }
}
