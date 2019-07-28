class Solution {
    public int largest1BorderedSquare(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                max=Math.max(max,getMax(grid,i,j));
            }
        }
        return max*max;
    }
    public int getMax(int[][] grid,int x,int y){
        int max=Math.min(grid.length-x,grid[0].length-y);
        while(help(grid,x,y,max)==false){
            max=max-1;
        }
        if(max==0 && grid[x][y]==1) max=1;
        return max;
    }
    public boolean help(int[][] grid,int x,int y,int size){
        //if(x+size>grid[0].length || y+size>grid.length) return false;
        for(int i=y;i<y+size;i++){
            if(grid[x][i]!=1)   return false;
        }
        for(int i=y;i<y+size;i++){
            if(grid[x+size-1][i]!=1)   return false;
        }
        for(int i=x;i<x+size;i++){
            if(grid[i][y]!=1)   return false;
        }
        for(int i=x;i<x+size;i++){
            if(grid[i][y+size-1]!=1)   return false;
        }
        return true;
    }
}