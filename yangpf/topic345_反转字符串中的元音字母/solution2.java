class Solution {
    public String reverseVowels(String s) {
        char[] res=new char[s.length()];
        int i=0,j=res.length-1;
        while(i<=j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(!isAEIOU(ch1)){
                res[i++]=ch1;
            }else if(!isAEIOU(ch2)){
                res[j--]=ch2;
            }else{
                res[i++]=ch2;
                res[j--]=ch1;
            }
        }
        return new String(res);
    }
    public boolean isAEIOU(Character ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true;
        return false;
    }
}