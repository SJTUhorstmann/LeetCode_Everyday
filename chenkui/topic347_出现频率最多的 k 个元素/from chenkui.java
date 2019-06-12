class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
      for(int tem:nums){
        if(map.containsKey(tem)){
          map.put(tem,map.get(tem)+1);
        }
        else{
          map.put(tem,1);
        }
      }
      List<Integer>[] list=new ArrayList[nums.length+1];
      for(int key: map.keySet()){
        int fre=map.get(key);
        if(list[fre]==null){
          list[fre]=new ArrayList<Integer>();
        }
        list[fre].add(key);
      }
      List<Integer> topK = new ArrayList<>();
      for(int i=nums.length;i>0 && topK.size()<k;i--){
        if(list[i]==null){
          continue;
        }
        if(list[i].size()<=k-topK.size()){
          topK.addAll(list[i]);
        }
        else{
          topK.addAll(list[i].subList(0,k-topK.size()));
        }
      }
      return topK;
    }
  
  
}
 
}
