import java.util.*;
public class Solution {
    public String replaceSpace(StringBuffer str) {
        StringBuilder st=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                st.append("%20");
            } 
            else{
                st.append(str.charAt(i));
            } 
        }
        return st.toString();
    }
}