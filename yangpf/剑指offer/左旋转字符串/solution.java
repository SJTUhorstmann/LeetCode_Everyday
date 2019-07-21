public class Solution {
    public String LeftRotateString(String str,int n) {
        StringBuilder sb=new StringBuilder();
        if(n==0 || str.length()==0 ||str==null)    return str;
        int len=str.length();
        n=n%len;
        return sb.append(str.substring(n,len)).append(str.substring(0,n)).toString();
    }
}