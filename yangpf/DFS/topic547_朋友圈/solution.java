class Solution {
    Queue<Integer> q=new LinkedList<>();
    public int findCircleNum(int[][] M) {
        int count=0;
        int m=M.length;
        int n=M[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(M[i][j]==1){
                    dfs(M,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int[][] M,int i,int j){
        if(i<0||i>=M.length||j<0||j>=M[0].length||M[i][j]==0){
            return;
        }
        M[i][j]=0;
        q.offer(j);
        while(!q.isEmpty()){
            int row=q.poll();
            for(int k=0;k<M[0].length;k++){
                dfs(M,row,k);
            }
        }
    }
}