class Solution {
    //方法1
   /* public int[] twoSum(int[] nums, int target) {
      int[] arr=new int[2];
      int len=nums.length;
      for(int i=0;i<len;i++){
        for(int j=i+1;j<len;j++){
          int tem=nums[i]+nums[j];
          if(tem==target){
            arr[0]=i;
            arr[1]=j;
            break;
          }
        }
      }
      return arr;
    }
    
    */
    
    public int[] twoSum(int[] nums, int target) {
        
        int[] arr=new int[2];
        int len=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            int tem=target-nums[i];
            if(map.containsKey(tem)){
                arr[0]=map.get(tem);
                arr[1]=i;
                return arr;
            }
            else{
                map.put(nums[i],i);
            }
            
        }
        return null;

}
}