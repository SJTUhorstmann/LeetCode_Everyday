class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z')
                ch=(char)(ch-'A'+'a');
            sb.append(ch);          
        }
        return sb.toString();
    }
}