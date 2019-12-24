class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length;i++){
            sb.append(new StringBuilder(str[i]).reverse());
            if(i==str.length-1) break;
            sb.append(" ");
        }
        return sb.toString();
    }
}