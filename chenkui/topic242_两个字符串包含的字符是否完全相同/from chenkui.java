class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null && t==null){
            return true;
        }
        else if(s==null || t==null){
            return false;
        }
        else{
            
            int len1=s.length();
            int len2=t.length();
            if(len1!=len2){
                return false;
            }
            int[] tem=new int[26];
            for(int i=0;i<len1;i++){
                int tem1=s.charAt(i)-'a';
                int tem2=t.charAt(i)-'a';
                tem[tem1]++;
                tem[tem2]--;
            }
            for(int j=0;j<26;j++){
                if(tem[j]!=0){
                    return false;
                }
            }
         }
        return true;
    }
}