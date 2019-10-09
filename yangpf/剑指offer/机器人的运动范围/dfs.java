public class Solution {
    int[] dx=new int[]{1,0,-1,0};
    int[] dy=new int[]{0,1,0,-1};
    int count=0;
    public int movingCount(int threshold, int rows, int cols)
    {
        boolean[][] visit=new boolean[rows][cols];
        dfs(0,0,threshold,visit);
        return count;
    }
    public void dfs(int i,int j,int threshold,boolean[][] visit){
        if(i<0||i>=visit.length||j<0||j>=visit[0].length||
           visit[i][j]||getSum(i,j)>threshold)    return;
        count++;
        visit[i][j]=true;
        for(int k=0;k<4;k++){
            dfs(i+dx[k],j+dy[k],threshold,visit);
        }
    }
    public int getSum(int i,int j){
        int sum=0;
        while(i!=0){
            sum+=i%10;
            i=i/10;
        }
        while(j!=0){
            sum+=j%10;
            j=j/10;
        }
        return sum;
    }
}