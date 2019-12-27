//递归的方法
class Solution {
    public int addDigits(int num) {
        if(num<10)  return num;
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num=num/10;
        }
        return addDigits(sum);
    }
}

//O(1)时间复杂度的解法，找规律