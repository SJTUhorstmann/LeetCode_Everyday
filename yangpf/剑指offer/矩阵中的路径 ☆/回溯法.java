public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(isPath(matrix,rows,cols,i,j,str,0,new boolean[rows][cols]))    
                    return true;
            }
        }
        return false;
    }
    public boolean isPath(char[] matrix,int rows,int cols,int x,int y,char[] str,int index,boolean[][] visit){
        if(x<0||x>=rows||y<0||y>=cols)    return false;
        int position = x * cols + y;
        if(visit[x][y]==false){
            if(str[index++]!=matrix[position])    return false;
            if(index==str.length)    return true;
            visit[x][y]=true;
            if(isPath(matrix,rows,cols,x+1,y,str,index,visit)||isPath(matrix,rows,cols,x-1,y,str,index,visit)
              ||isPath(matrix,rows,cols,x,y+1,str,index,visit)||isPath(matrix,rows,cols,x,y-1,str,index,visit))
                return true;
            //为什么下面代码注释掉依然能ac？不应该还原visit吗
            //visit[x][y]=false;
        }
        return false;
    }

}