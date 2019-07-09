public class Solution {
    public double Power(double base, int exponent) {
        double value=1.0;
        if(exponent==0)    return value;
        if(exponent>0){
            while(exponent-->0){
                value=base*value;
            }
        }else{
            base=value/base;
            exponent*=-1;
            while(exponent-->0){
                value=base*value;
            }
        }
        return value;
  }
}

//写法简化一下
public class Solution {
    public double Power(double base, int exponent) {
        double value=1.0;
        if(exponent==0)    return value;
        if(exponent<0){
            base=value/base;
            exponent*=-1;
        }
        while(exponent-->0){
            value=base*value;
        }
        return value;
  }
}