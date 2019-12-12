class Solution {
    public int subtractProductAndSum(int n) {
        int num1=1,num2=0;
        while(n!=0){
            int count=n%10;
            num1*=count;
            num2+=count;
            n=n/10;
        }
        return num1-num2;
    }
}