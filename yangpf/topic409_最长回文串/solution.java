class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        int len=0;
        boolean flag=false;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()%2==1){
                len+=entry.getValue()-1;
                flag=true;
            }else{
                len+=entry.getValue();
            }
        }
        if(flag==true)    len+=1;
        return len;
    }
}