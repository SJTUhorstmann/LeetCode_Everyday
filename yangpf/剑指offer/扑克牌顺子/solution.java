import java.util.Arrays;
public class Solution {
    public boolean isContinuous(int [] numbers) {
        Arrays.sort(numbers);
        int zeroNum=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0)    zeroNum++;
        }
        if(zeroNum==4)    return true;
        int diff=0;
        for(int i=zeroNum;i<numbers.length-1;i++){
            diff+=numbers[i+1]-numbers[i];
            if(numbers[i+1]==numbers[i])    return false;
        }
        if(diff<=zeroNum+numbers.length-zeroNum-1)    return true;
        return false;
    }
}