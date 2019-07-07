//只对正数有效
public class Solution {
    public int NumberOf1(int n) {
        int num=0;
        while(n!=0){
            if(n%2!=0)    num++;
            n=n/2;
        }
        return num;
    }
}

//可能陷入死循环，因为负数右移时，在最高位补得是1
public class Solution {
    public int NumberOf1(int n) {
        int num=0;
        while(n!=0){
            if(n%2!=0)    num++;
            n=n>>1;
        }
        return num;
    }
}

//使用1左移与每一位进行与运算
public class Solution {
    public int NumberOf1(int n) {
        int flag=1;
        int num=0;
        while(flag!=0){
            //注意这个地方n&flag必须带括号
            if((n&flag)!=0)    num++;
            flag=flag<<1;
        }
        return num;
    }
}