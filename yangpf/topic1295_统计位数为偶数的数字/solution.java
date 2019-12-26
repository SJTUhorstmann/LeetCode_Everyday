//时间复杂度略高，判断整数位数长度可以用内置转换字符串函数，获取字符串长度，或者直接用语言内置的以 10 为底的对数函数 log10() 来得到整数 x 包含的数字个数，Java中为Math.log10(x)
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(countBit(num)%2==0) count++;
        }
        return count;
    }
    public int countBit(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }
}