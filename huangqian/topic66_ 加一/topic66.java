public int[] plusOne(int[] digits) {
    int l=digits.length;
    for(int i=l-1;i>=0;i--){
        digits[i]++;
        digits[i]=digits[i]%10;
        if(digits[i]!=0) return digits;
    }
    int[] ans=new int[l+1];
    ans[0]=1;
    return ans;
}