class UnionFind {
    private int[] parent;
    public UnionFind(int size){
        parent=new int[size];
        for(int i=0;i<size;i++){
            parent[i]=i;
        }
    }
    public UnionFind(){
        this(10);
    }
    public int find(int index){
        if(index<0 || index>=parent.length) return -1;
        while(parent[index]!=index){
            index=parent[index];
        }
        return index;
    }
    public boolean isConnected(int p,int q){
        return find(p)==find(q);
    }
    public void unionElement(int p,int q){
        int pRoot=find(p);
        int qRoot=find(q);
        if(pRoot==qRoot)    return;
        parent[pRoot]=qRoot;
    }
    public int count(){
        int count=0;
        for(int i=0;i<parent.length;i++){
            if(parent[i]==i){
                count++;
            }
        }
        return count;
    }
}
class Solution {
    public int findCircleNum(int[][] M) {
        int N=M.length;
        UnionFind union=new UnionFind(N);
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(M[i][j]==1){
                    union.unionElement(i,j);
                }
            }
        }
        return union.count();
    }
}