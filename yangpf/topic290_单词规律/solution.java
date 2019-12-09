class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] arr=new String[26];
        String[] strs=str.split(" ");
        if(pattern.length()!=strs.length)   return false;
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            if(arr[pattern.charAt(i)-'a']==null){
                if(set.contains(strs[i]))   return false;
                arr[pattern.charAt(i)-'a']=strs[i];
                set.add(strs[i]);
            }else{
                if(!strs[i].equals(arr[pattern.charAt(i)-'a'])){
                    return false;
                }
            }
        }
        return true;
    }
}