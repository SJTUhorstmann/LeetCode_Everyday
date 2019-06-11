class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m)    return false;
        char[] array1=s.toCharArray();
        char[] array2=t.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return String.valueOf(array1).equals(String.valueOf(array2));
    }
}