class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }

        int first=0;
        int second=1;
        int third=1;
        int result=2;

        for(int i=3;i<n;i++){
            first=second;
            second=third;
            third=result;
            result=first+second+third;
        }

        return result;
        
    }
}