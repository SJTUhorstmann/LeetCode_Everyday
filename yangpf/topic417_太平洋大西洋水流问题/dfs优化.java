class Solution {
    int[] dx=new int[]{1,0,-1,0};
    int[] dy=new int[]{0,1,0,-1};
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res=new ArrayList<>();
        int m=matrix.length;
        if(m==0)    return res;
        int n=matrix[0].length;
        if(n==0)    return res;
        boolean [][] canReachP=new boolean[m][n];
        boolean [][] canReachA=new boolean[m][n];
        for(int i=0;i<m;i++){
            dfs(matrix,i,0,canReachP);
            dfs(matrix,i,n-1,canReachA);
        }
        for(int i=0;i<n;i++){
            dfs(matrix,0,i,canReachP);
            dfs(matrix,m-1,i,canReachA);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(canReachP[i][j]&&canReachA[i][j]){
                    List<Integer> list=new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    res.add(list);
                }
            }
        }
        return res;
    }
    public void dfs(int[][] matrix,int i,int j,boolean[][] canReach){
        if(canReach[i][j]){
            return;
        }
        canReach[i][j]=true;
        int height=matrix[i][j];
        for(int k=0;k<4;k++){
            int tx=i+dx[k];
            int ty=j+dy[k];
            if(tx>=0&&tx<canReach.length&&ty>=0&&ty<canReach[0].length&&matrix[tx][ty]>=height){
                dfs(matrix,tx,ty,canReach);
            }
        }
    }
}