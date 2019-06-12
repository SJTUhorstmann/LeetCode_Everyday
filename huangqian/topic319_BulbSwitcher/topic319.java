//所以一个数有奇数个约数，等价于它是平方数。假设有n个灯泡，则从1~n中共有根号n个平方数
public class Solution319 {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
}