class Solution {
    
    //方法1
    /*
    public int singleNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum^nums[i];
        }
        return sum;
        
    }*/
    
    //方法2
     public int singleNumber(int[] nums) {
        int sum=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
    
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int arr:map.keySet()){
            if(map.get(arr)==1){
                return arr;
            }
        }
        return sum;
        
    }
}