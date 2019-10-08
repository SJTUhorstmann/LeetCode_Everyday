//陆地往海洋，超时
class Solution {
    int[] dx=new int[]{1,0,-1,0};
    int[] dy=new int[]{0,1,0,-1};
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res=new ArrayList<>();
        int m=matrix.length;
        if(m==0)    return res;
        int n=matrix[0].length;
        if(n==0)    return res;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs1(matrix,i,j)&&dfs2(matrix,i,j)){
                    List<Integer> list=new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    res.add(list);
                }
            }
        }
        return res;
    }
    public boolean dfs1(int[][] matrix,int i,int j){
        if(i==0||j==0)  return true;
        if(i>=matrix.length||j>=matrix[0].length)   return false;
        int height=matrix[i][j];
        boolean flag=false;
        for(int k=0;k<4;k++){
            int tx=i+dx[k];
            int ty=j+dy[k];
            if(tx>=0&&tx<matrix.length&&ty>=0&&ty<matrix[0].length){
                if(matrix[tx][ty]!=-1&&matrix[tx][ty]<=height){
                    matrix[i][j]=-1;
                    flag=flag|dfs1(matrix,tx,ty);
                    matrix[i][j]=height;
                }
            }
        }
        return flag;
    }
    public boolean dfs2(int[][] matrix,int i,int j){
        if(i==matrix.length-1||j==matrix[0].length-1)  return true;
        if(i<0||j<0)   return false;
        int height=matrix[i][j];
        boolean flag=false;
        for(int k=0;k<4;k++){
            int tx=i+dx[k];
            int ty=j+dy[k];
            if(tx>=0&&tx<matrix.length&&ty>=0&&ty<matrix[0].length){
                if(matrix[tx][ty]!=-1&&matrix[tx][ty]<=height){
                    matrix[i][j]=-1;
                    flag=flag|dfs2(matrix,tx,ty);
                    matrix[i][j]=height;
                }
            }
        }
        return flag;
    }
}