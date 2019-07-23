public class Solution {
    public int StrToInt(String str) {
        if(str==null || str.length()==0)    return 0;
        char firstChar=str.charAt(0);
        if(firstChar!='+' && firstChar!='-' && (firstChar<'1'||firstChar>'9'))    return 0;
        if(str.length()==1 && (firstChar=='+'||firstChar=='-'))    return 0;
        int num=0;
        int len=str.length();
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch<'0'||ch>'9')    return 0;
            num+=(int)Math.pow(10,len-2)*(ch-'0');
            len--;
        }
        if(firstChar>='1'&&firstChar<='9'){
            num+=(int)Math.pow(10,str.length()-1)*(firstChar-'0');
            return num;
        }
        if(firstChar=='-')    return -num;
        return num;
    }
}