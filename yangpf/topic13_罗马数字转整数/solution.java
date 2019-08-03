class Solution {
    public int romanToInt(String s) {
        int sum=0;
        if(s.length()==0)   return 0;
        if(s.length()==1)   return getValue(s.charAt(0));
        for(int i=0;i<s.length()-1;i++){
            if(getValue(s.charAt(i))>=getValue(s.charAt(i+1))){
                sum+=getValue(s.charAt(i));
            }else{
                sum-=getValue(s.charAt(i));
            }
        }
        sum+=getValue(s.charAt(s.length()-1));
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