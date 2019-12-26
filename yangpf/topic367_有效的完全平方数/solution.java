//暴力
class Solution {
    public boolean isPerfectSquare(int num) {
        for(int i=1;i<=(num+1)/2;i++){
            if(num==i*i)    return true;
        }    
        return false;
    }
}

//利用 1+3+5+7+9+…+(2n-1)=n^2，即完全平方数肯定是前n个连续奇数的和
class Solution {
    public boolean isPerfectSquare(int num) {
        int count=1;
        while(num>0){
            num-=count;
            count+=2;
        }
        if(0==num)    return true;
        return false;
    }
}

//下面做法会整型溢出，应该按照上述代码
class Solution {
    public boolean isPerfectSquare(int num) {
        int sum=0;
        int count=1;
        while(sum<num){
            sum+=count;
            count+=2;
        }
        if(sum==num)    return true;
        return false;
    }
}

//二分法
