class Solution {
    public String frequencySort(String s) {
      HashMap<Character,Integer> map=new HashMap<Character,Integer>();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(map.containsKey(ch)){
          map.put(ch,map.get(ch)+1);
        }
        else{
          map.put(ch,1);
        }
      }
      StringBuilder result=new StringBuilder();
      ArrayList<Character>[] list = new ArrayList[s.length() + 1];
      for(char ch:map.keySet()){
        int tem=map.get(ch);
        if(list[tem]==null)
        {
          list[tem]=new ArrayList<Character>(); 
        }
        list[tem].add(ch);
      }
      for(int i=s.length();i>0;i--){
        if(list[i]==null){
          continue;
        }
        for(int j=0;j<list[i].size();j++){
          char ch1=list[i].get(j);
          for(int k=0;k<i;k++){
            result.append(ch1);
          }
        }
      }
      return result.toString();
    }
}
 
}
