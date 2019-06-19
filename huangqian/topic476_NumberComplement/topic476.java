class Solution {
    public int findComplement(int num) {
        int res=0,t=0;//t表示当前枚举到第几位
        //取反会改变符号位
        while(num!=0){
            int a = num%2==0?1:0;
            res += a<<t++;
            // 移位运算符只返回结果，不原地修改
            num = num>>1;
        }
        return res;       
    }
}