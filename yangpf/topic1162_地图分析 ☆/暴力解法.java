//将陆地都取出来放在list里面，对每个海洋求最大距离   33/35
class LandPoint{
    int x;
    int y;
}
class Solution {
    public int maxDistance(int[][] grid) {
        ArrayList<LandPoint> list=new ArrayList<>();
        //HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    LandPoint landPoint=new LandPoint();
                    landPoint.x=i;
                    landPoint.y=j;
                    list.add(landPoint);
                }
            }
        }
        if(list.isEmpty() || list.size()==grid.length * grid[0].length) return -1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    int min=Integer.MAX_VALUE;
                    for(int k=0;k<list.size();k++){
                        int distance=Math.abs(i-list.get(k).x)+Math.abs(j-list.get(k).y);
                        min=Math.min(min,distance);
                        if(!res.isEmpty() && min<max)   break;
                    }
                    res.add(min);
                    max=Math.max(max,min);
                }
            }
        }
        return max;
    }
}