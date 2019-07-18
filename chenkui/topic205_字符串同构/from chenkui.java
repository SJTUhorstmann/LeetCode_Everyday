class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        if(len1!=len2){
            return false;
        }
        
        int[] tem1 = new int[256];
        int[] tem2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (tem1[sc] != tem2[tc]) {
                return false;
            }
            tem1[sc] = i + 1;
            tem2[tc] = i + 1;
        }
        return true;
}
}