class Solution {
    public String removeVowels(String S) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                continue;
            }
            sb.append(String.valueOf(ch));
        }
        return sb.toString();
    }
}