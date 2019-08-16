class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<=j){
            char ch=s.charAt(i);
            if(isAEIOU(ch)){
                while(!isAEIOU(s.charAt(j)) && i<=j){
                    j--;
                }
                swap(arr,i,j);
                j--;
            }
            i++;
        }
        return new String(arr);
    }
    public boolean isAEIOU(Character ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true;
        return false;
    }
    public void swap(char[] arr,int i,int j){
        char ch=arr[i];
        arr[i]=arr[j];
        arr[j]=ch;
    }
}