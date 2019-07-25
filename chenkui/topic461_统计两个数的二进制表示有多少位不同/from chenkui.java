class Solution {
    public int hammingDistance(int x, int y) {
        int tem=x^y;
        int count=0;
        while(tem!=0){
            count++;
            tem=tem&(tem-1);
        }
        return count;  
    }
}