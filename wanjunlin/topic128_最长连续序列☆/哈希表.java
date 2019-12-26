class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,1);
        }
        for(int num:nums){
            generate(map,num);
        }
        return maxCount(map);
    }
    public int generate(HashMap<Integer,Integer> map,int num){
        if(!map.containsKey(num)){
            return 0;
        }
        int count = map.get(num);
        if(count>1){
            return count;
        }
        count = generate(map,num+1)+1;
        map.put(num,count);
        return count;
    }
    public int maxCount(HashMap<Integer,Integer> map){
        int max = 0;
        for(int num:map.keySet()){
            max = Math.max(max,map.get(num));
        }
        return max;
    }
}