class Solution {
    public int lengthOfLastWord(String s) {
        // boolean flag=false;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)!=' ')    break;
        //     if(i==s.length()-1) flag=true;
        // }
        // if(flag==true)  return 0;
        String[] strs=s.split(" ");
        if(strs.length==0)  return 0;
        int n=strs.length;
        return strs[n-1].length();
    }
}