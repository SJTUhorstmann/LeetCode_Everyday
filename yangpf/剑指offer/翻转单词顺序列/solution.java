public class Solution {
    public String ReverseSentence(String str) {
        StringBuilder sb=new StringBuilder();
        String[] strs=str.split(" ");
        if(strs.length==0)    return str;
        for(int i=strs.length-1;i>=0;i--){
            if(i==0)    sb.append(strs[i]);
            else{
                sb.append(strs[i]+" ");
            }
        }
        return sb.toString();
    }
}