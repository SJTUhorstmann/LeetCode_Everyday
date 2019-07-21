class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix.length==1){
            return matrix[0][0];
        }
        
        int len=matrix.length*matrix[0].length;
        if(len>2*k){
            PriorityQueue<Integer> max=new PriorityQueue<Integer>((a,b)->b-a);
            for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                max.add(matrix[i][j]);
                if(max.size()>k){
                    max.poll();
                }
            }
        }
        return max.peek();
            
        }
        else{
                    
            PriorityQueue<Integer> min=new PriorityQueue<Integer>();
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    min.add(matrix[i][j]);
                    if(min.size()>(len-k+1)){
                        min.poll();
                    }
                }
            }
            return min.peek();
            
      }
    }
}