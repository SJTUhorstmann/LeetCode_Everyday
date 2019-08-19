class Point{
    int x;
    int y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int maxDistance(int[][] grid) {
        Queue<Point> q=new LinkedList<>();
        int N=grid.length;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(grid[i][j]==1){
                    q.offer(new Point(i,j));
                }
            }
        }
        if(q.size()==N*N || q.isEmpty())    return -1;
        int val=1;
        int[] X=new int[]{0,-1,1,0};
        int[] Y=new int[]{1,0,0,-1};
        while(!q.isEmpty()){
            Point point=q.poll();
            int x=point.x;
            int y=point.y;
            val=grid[x][y];
            for(int i=0;i<4;i++){
                int nextX=x+X[i];
                int nextY=y+Y[i];
                if(nextX<0||nextX>=N||nextY<0||nextY>=N)    continue;
                if(grid[nextX][nextY]==0){
                    grid[nextX][nextY]=val+1;
                    q.offer(new Point(nextX,nextY));
                }
            }
        }
        return val-1;
    }
}