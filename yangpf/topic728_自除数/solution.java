class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isDividingNumber(i)){
                res.add(i);
            }
        }
        return res;
    }
    public boolean isDividingNumber(int num){
        int tmp=num;
        while(num!=0){
            int divide=num%10;
            num=num/10;
            if(divide==0 || tmp%divide!=0)   return false;
        }
        return true;
    }
}