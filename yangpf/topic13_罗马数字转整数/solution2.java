class Solution {
    public int romanToInt(String s) {
        int sum=0;
        if(s.length()==0)   return 0;
        if(s.length()==1)   return getValue(s.charAt(0));
        int i=s.length()-1;
        while(i>0){
            int j=i;
            while(j>0 && getValue(s.charAt(j))>getValue(s.charAt(j-1))){
                j--;
            }
            int tempSum=getValue(s.charAt(i));
            for(int k=0;k<i-j;k++){
                tempSum-=getValue(s.charAt(i-k-1));
            }
            sum+=tempSum;
            i=j-1;
        }
        if(getValue(s.charAt(1))<=getValue(s.charAt(0)))    sum+=getValue(s.charAt(0));
        return sum;
    }
    public int getValue(char c){
        switch(c){
            case 'I':
                    return 1;
            case 'V':
                    return 5;
            case 'X':
                    return 10;
            case 'L':
                    return 50;
            case 'C':
                    return 100;
            case 'D':
                    return 500;
            case 'M':
                    return 1000;
            default:
                return -1;
        }
    }
}