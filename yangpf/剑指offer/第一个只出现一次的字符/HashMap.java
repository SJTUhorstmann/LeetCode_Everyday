import java.util.HashMap;
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        int i=0;
        while(i<=str.length()-1){
            if(map.get(str.charAt(i))==1)    return i;
            i++;
        }
        return -1;
    }
}