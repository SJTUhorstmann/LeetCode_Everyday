class Solution {
    public int countCharacters(String[] words, String chars) {
        int count=0;
        for(String s:words){
            int[] array=new int[26];
            for(int i=0;i<chars.length();i++){
                array[chars.charAt(i)-'a']++;
            }
            if(help(s,array)){
                count+=s.length();
            }
        }
        return count;
    }
    public boolean help(String s,int[] array){
        for(int i=0;i<s.length();i++){
            array[s.charAt(i)-'a']--;
            if(array[s.charAt(i)-'a']<0)    return false;
        }
        return true;
    }
}