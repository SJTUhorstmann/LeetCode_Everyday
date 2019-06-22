public class Solution260 {
    public int[] singleNumber(int[] nums) {
        int s=0;
        for(int x:nums) s^=x;

        int k=0;
        int ss=0;
        ss=s&1;
        while (ss==0) {
            k++;
            ss=s>>k&1;
        }
        int s2=0;
        int num1=0,num2=0;
        int ss1=0;
        for(int x:nums){
            ss1=x>>k&1;
            if(ss1!=0) num1^=x;
        }
        num2=s^num1;
        int []res={num1,num2};
        return res;

    }
}