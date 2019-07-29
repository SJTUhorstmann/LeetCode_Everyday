class Solution {
    public int numTrees(int n) {
        if(n==1)    return 1;
        if(n==2)    return 2;
        if(n==3)    return 5;
        int sum=numTrees(n-1)*2+numTrees(n-2)*2;
        int x=n-3;
        while(x>=2){
            sum+=numTrees(x)*numTrees(n-1-x);
            x--;
        }
        return sum;
    }
}