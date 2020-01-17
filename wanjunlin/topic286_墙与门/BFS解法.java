
class Solution {
    private static final int EMPTY = Integer.MAX_VALUE;
    private static final int GATE = 0;
    private static final List<int[]> DIRECTIONS = Arrays.asList(
            new int[]{0,1},
            new int[]{0,-1},
            new int[]{1,0},
            new int[]{-1,0}
    );
    public void wallsAndGates(int[][] rooms) {
        int row = rooms.length;
        if(row==0){
            return;
        }
        int col = rooms[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(rooms[i][j]==GATE){
                    queue.add(new int[]{i,j});
                }
            }
        }
        while(!queue.isEmpty()){
            int[] point = queue.poll();
            int currow = point[0];
            int curcol = point[1];
            for(int[] d:DIRECTIONS){
                int r = currow+d[0];
                int c = curcol+d[1];
                if(r<0||r>=row||c<0||c>=col||rooms[r][c]!=EMPTY){
                    continue;
                }
                rooms[r][c]=rooms[currow][curcol]+1;
                queue.add(new int[]{r,c});
            }
        }
    }
}