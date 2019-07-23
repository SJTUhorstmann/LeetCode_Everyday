public class Solution {
    public int FirstNotRepeatingChar(String str) {
        for(int i=0;i<str.length();i++){
            if(str.lastIndexOf(str.charAt(i))==i
              && str.indexOf(str.charAt(i))==i)    return i;
        }
        return -1;
    }
}