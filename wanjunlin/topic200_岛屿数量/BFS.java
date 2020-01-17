class Solution {
    private int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0){
            return  0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int level = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    level++;
                    grid[i][j]='0';
                    queue.add(new int[]{i,j});
                    while(!queue.isEmpty()){
                        int[] point = queue.poll();
                        int row = point[0];
                        int col = point[1];
                        for(int[] d:directions){
                            int r = row+d[0];
                            int c = col+d[1];
                            if(r<0||r>=m||c<0||c>=n||grid[r][c]=='0'){
                                continue;
                            }
                            grid[r][c]='0';
                            queue.add(new int[]{r,c});
                        }
                    }
                }
            }
        }
        return level;
    }
}
