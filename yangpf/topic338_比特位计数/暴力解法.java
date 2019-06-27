class Solution {
    public int[] countBits(int num) {
        int[] array=new int[num+1];
        array[0]=0;
        for(int i=1;i<=num;i++){
            array[i]=countOne(i);
        }
        return array;
    }
    public int countOne(int x){
        int count=0;
        while(x!=0){
            if(x%2==1)  count++;
            x=x>>1;
        }
        return count;
    }
}