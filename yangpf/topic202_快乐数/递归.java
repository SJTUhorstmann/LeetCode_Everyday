class Solution {
    int num=1;
    public boolean isHappy(int n) {
        num++;
        if(num>7) return false;
        String s=String.valueOf(n);
        int count=s.length();
        int value=(int)Math.pow(10,count-1);
        if(n==value)    return true;
        int newValue=0;
        while(n!=0){
            value=(int)Math.pow(10,count-1);
            newValue+=Math.pow(n/value,2);
            n=n%value;
            count--;
        }
        return isHappy(newValue);
    }
}