class Solution {
    private static final int EMPTY = Integer.MAX_VALUE;
    private static final int GATE = 0;
    private static final int WALL = -1;
    private static final List<int[]> DIRECTIONS = Arrays.asList(
            new int[]{0,1},
            new int[]{0,-1},
            new int[]{1,0},
            new int[]{-1,0}
    );
    public void wallsAndGates(int[][] rooms) {
        for(int i=0;i<rooms.length;i++){
            for (int j=0;j<rooms[0].length;j++){
                if(rooms[i][j]==EMPTY){
                    rooms[i][j] = lengthoflatestgates(rooms,i,j);
                }
            }
        }
    }

    public int lengthoflatestgates(int[][] rooms, int startrow, int startcol) {
        int rowcnt = rooms.length;
        int colcnt = rooms[0].length;
        int[][] direction = new int[rowcnt][colcnt];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startrow,startcol});
        while (!queue.isEmpty()){
            int[] point  =queue.poll();
            int beginrow = point[0];
            int begincol = point[1];
            for(int[] d:DIRECTIONS){
                int curRow = beginrow+d[0];
                int curCol = begincol+d[1];
                if(curRow<0||curRow>=rowcnt||curCol<0||curCol>=colcnt||rooms[curRow][curCol]==WALL||direction[curRow][curCol]!=0){
                    continue;
                }
                direction[curRow][curCol]=direction[beginrow][begincol]+1;
                if(rooms[curRow][curCol]==GATE){
                    return direction[curRow][curCol];
                }
                queue.add(new int[]{curRow,curCol});
            }
        }
        return Integer.MAX_VALUE;
    }
}