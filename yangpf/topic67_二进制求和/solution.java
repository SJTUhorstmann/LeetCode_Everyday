class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0){
            int x=i>=0?a.charAt(i)-'0':0;
            int y=j>=0?b.charAt(j)-'0':0;
            int value=x+y+carry;
            sb.append(value%2);
            carry=value/2;
            i--;
            j--;
        }
        if(carry==1)    sb.append(1);
        return sb.reverse().toString();
    }
}