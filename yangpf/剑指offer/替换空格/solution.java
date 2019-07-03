public class Solution {
    public String replaceSpace(StringBuffer str) {
        int spaceNum=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')    spaceNum++;
        }
        int newLength=str.length()+spaceNum*2;
        int oldLength=str.length();
        str.setLength(newLength);
        int index=newLength-1;
        for(int i=oldLength-1;i>=0;i--){
            char ch=str.charAt(i);
            if(ch!=' '){
                str.setCharAt(index--,ch);
            }else{
                str.setCharAt(index--,'0');
                str.setCharAt(index--,'2');
                str.setCharAt(index--,'%');
            }
        }
        return str.toString();
    }
}