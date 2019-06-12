class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        if(len==1 && digits[0]!=9){
            digits[0]+=1;
            return digits;
        }
        if(len==1 && digits[0]==9){
            int[] array=new int[]{1,0};
            return array;
        }
        boolean plusOne=true;
        for(int i=len-1;i>=1;i--){
            if(digits[i]!=9){
                digits[i]+=1;
                plusOne=false;
                break;
            }else if(digits[i]==9 && digits[i-1]!=9){
                digits[i]=0;
                digits[i-1]+=1;
                plusOne=false;
                break;
            }else{
                digits[i]=0;
            }
        }
        if(digits[0]==9 && plusOne==true){
            int[] array=new int[len+1];
            array[0]=1;
            for(int i=1;i<array.length;i++){
                array[i]=0;
            }
            return array;
        }
        return digits;
    }
}