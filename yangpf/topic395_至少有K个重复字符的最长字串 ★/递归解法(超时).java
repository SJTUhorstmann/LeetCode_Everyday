class Solution {
    public int longestSubstring(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(Character key:map.keySet()){
            if(map.get(key)<k){
                int index=s.indexOf(key);
                return Math.max(longestSubstring(s.substring(0,index),k),longestSubstring(s.substring(index+1,s.length()),k));
            }
        }
        return s.length();
    }
}