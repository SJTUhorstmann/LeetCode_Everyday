//笨方法
class Solution {
    public boolean detectCapitalUse(String word) {
        if(isUpperCase(word)||isLowerCase(word))    return true;
        if(word.charAt(0)<'A'||word.charAt(0)>'Z')  return false;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)<'a'||word.charAt(i)>'z')  return false;
        }
        return true;
    }
    public boolean isUpperCase(String word){
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)<'A'||word.charAt(i)>'Z')  return false;
        }
        return true;
    }
    public boolean isLowerCase(String word){
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)<'a'||word.charAt(i)>'z')  return false;
        }
        return true;
    }
}

//可以统计大小写的个数