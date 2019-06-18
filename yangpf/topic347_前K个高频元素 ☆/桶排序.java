//该做法实际上有bug 比如[1,1,1,2,2,2,3,3,3]返回的是[1,2,3]，但实际上不符合题意
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket=new List[nums.length+1];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(int key:map.keySet()){
            int frequency=map.get(key);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<Integer>();
            }
            bucket[frequency].add(key);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=nums.length;i>0 && k>0;i--){
            if(bucket[i]!=null){
                res.addAll(bucket[i]);
                k=k-bucket[i].size();
            }
        }
        //return res.subList(0,k);
        return res;
    }
}