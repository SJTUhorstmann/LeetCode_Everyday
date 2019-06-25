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
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int j=i;
            if(map.get(c)<k){
                while(j<s.length()){
                    if(s.charAt(j)!=c)  break;
                    j++;
                }
                return Math.max(longestSubstring(s.substring(0,i),k),longestSubstring(s.substring(j),k));
            }
        }
        return s.length();
    }
}