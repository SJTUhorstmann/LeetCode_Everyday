class Solution {
    public int[] countBits(int num) {
        int[] tem = new int[num + 1];
        
        for(int i = 1; i <= num; i++){
            tem[i] = tem[i&(i-1)] + 1;
        }
        
    return tem;
}
}