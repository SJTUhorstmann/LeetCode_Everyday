public class Solution {
    int[] dx=new int[]{1,0,-1,0};
    int[] dy=new int[]{0,1,0,-1};
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        boolean flag=false;
        boolean[][] visit=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                flag|=dfs(matrix,i,j,visit,str,0);
                if(flag)    return true;
            }
        }
        return false;
    }
    public boolean dfs(char[]matrix,int i,int j,boolean[][] visit,
                       char[] str,int index){
        if(i<0||i>=visit.length||j<0||j>=visit[0].length||
           visit[i][j]||matrix[i*visit[0].length+j]!=str[index])    return false;
        if(index==str.length-1)    return true;
        boolean flag=false;
        visit[i][j]=true;
        for(int k=0;k<4;k++){
            flag|=dfs(matrix,i+dx[k],j+dy[k],visit,str,index+1);
            if(flag)    return true;
        }
        visit[i][j]=false;
        return flag;
    }
}