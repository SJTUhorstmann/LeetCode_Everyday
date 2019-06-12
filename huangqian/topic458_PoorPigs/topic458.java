public class Solution458 {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int b=minutesToTest/minutesToDie+1;//一共有多少种状态
        int k=0,n=1;//k表示猪的数量，n表示k头猪的总的状态数
        while (n<buckets){
            k++;
            n*=b;
        }
        return k;
    }
} 