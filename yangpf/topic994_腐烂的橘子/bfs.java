class Position{
    int x;
    int y;
    Position(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Position> q=new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
        int[] X=new int[]{1,0,-1,0};
        int[] Y=new int[]{0,1,0,-1};
        //新鲜橘子个数
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new Position(i,j));
                }else if(grid[i][j]==1){
                    count++;
                }
            }
        }
        if(count==0)    return 0;
        if(q.size()==0) return -1;
        int time=0;
        while(!q.isEmpty()){
            int size=q.size();
            boolean flag=false;
            while(size-->0){
                Position cur=q.poll();
                int x=cur.x;
                int y=cur.y;
                for(int i=0;i<4;i++){
                    int next_x=x+X[i];
                    int next_y=y+Y[i];
                    if(next_x>=0&&next_x<m&&next_y>=0&&next_y<n&&grid[next_x][next_y]==1){
                        flag=true;
                        count--;
                        grid[next_x][next_y]=2;
                        q.offer(new Position(next_x,next_y));
                    }
                }
            }
            if(!flag){
                break;
            }
            time++;
        }
        if(count!=0)    return -1;
        return time;
    }
}