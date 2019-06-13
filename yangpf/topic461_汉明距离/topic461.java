class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        for(int i=0;i<32;i++){
            int z=x^y;
            if(z%2==1)  count++;
            x=x>>1;
            y=y>>1;
        }
        return count;
    }
}

//其实不需要像上面异或那么多次
class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        int z=x^y;
        for(int i=0;i<32;i++){
            if(z%2==1)  count++;
            z=z>>1;
        }
        return count;
    }
}