class Solution {
    
    //方法1
    public int[] nextGreaterElements(int[] nums) {
        int len=nums.length;
        int[] result=new int[len];
        Arrays.fill(result,-1);
        
        for(int i=0;i<len;i++){
            int tem=nums[i];
            boolean judge=false;
            
            for(int j=i+1;j<len;j++){
                if(tem<nums[j]){
                    result[i]=nums[j];
                    judge=true;
                    break;    
                }
            }
            if(!judge){
                for(int k=0;k<i;k++){
                   if(tem<nums[k]){
                      result[i]=nums[k];
                      break;
                   }
                }  
            }
        }
        
        return result;
        
    }

   //方法2
   /* public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] next = new int[n];
        Arrays.fill(next, -1);
        Stack<Integer> pre = new Stack<>();
        
        for (int i = 0; i < n * 2; i++) {
           int num = nums[i % n];
           while (!pre.isEmpty() && nums[pre.peek()] < num) {
              next[pre.pop()] = num;
           }
           if (i < n){
              pre.push(i);
           }
        }
       return next;
}*/
}