import java.util.*;

public class Solution {
    public double Power(double base, int exponent) {
        if(exponent==0) return 1;
        if(exponent==1) return base;
        int tem=Math.abs(exponent);
        double result1=Power1(base,tem);
        return exponent>0? result1:1/result1;
        
  }
    public double Power1(double base, int exponent) {
        if(exponent==0) return 1;
        if(exponent==1) return base;
        double result=Power(base,exponent/2);
        return exponent%2==0? result*result:result*result*base;
  }
}