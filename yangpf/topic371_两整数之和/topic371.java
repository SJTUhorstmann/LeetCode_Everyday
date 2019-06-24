class Solution {
    public int getSum(int a, int b) {
        int sum,carry;
        sum=a^b;
        carry=(a&b) << 1;
        if(carry!=0){
            return getSum(sum,carry);
        }
        return sum;
    }
}