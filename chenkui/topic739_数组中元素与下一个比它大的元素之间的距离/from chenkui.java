class Solution {
    // 方法1
    /*public int[] dailyTemperatures(int[] T) {
        int[] result=new int[T.length];
        for(int i=0;i<T.length;i++){
            int tem=T[i];
            for(int j=i+1;j<T.length;j++){
                if(T[j]>tem){
                    result[i]=j-i;
                    break;
                }
            }
        }
        return result; 
    }*/
    
    // 方法2
    public int[] dailyTemperatures(int[] T) {
    int[] result=new int[T.length];
        
    Stack<Integer> indexs = new Stack<>();
    for (int curIndex = 0; curIndex <T.length; curIndex++) {
        while (!indexs.isEmpty() && T[curIndex] > T[indexs.peek()]) {
            int preIndex = indexs.pop();
            result[preIndex] = curIndex - preIndex;
        }
        indexs.add(curIndex);
    }
    return result;
}
    
}