class Solution {
    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        int min=Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<=min){
                min=arr[i];
            }
            stack.push(min);
        }
        int res=0;
        int max=-1;
        stack.pop();
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
            if(!stack.isEmpty()){
                if(max<=stack.peek()){
                    res++;
                    max=-1;
                }
                stack.pop();
            }
            if(stack.isEmpty()){
                res++;
                break;
            }
        }
        return res;
    }
}