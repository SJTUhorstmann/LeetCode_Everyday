class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] graphic = new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            graphic[i] = new ArrayList<>();
        }
        for(int[] pre:prerequisites){
            graphic[pre[0]].add(pre[1]);
        }
        Stack<Integer> poststack = new Stack<>();
        boolean[] localMarked = new boolean[numCourses];
        boolean[] globalMarked = new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(hasCycle(globalMarked,localMarked,poststack,graphic,i)){
                return new int[0];
            }
        }
        int[] ret = new int[numCourses];
        for(int i=numCourses-1;i>=0;i--){
            ret[i] = poststack.pop();
        }
        return ret;
     }
     public boolean hasCycle(boolean[] globalMarked, boolean[] localMarked, Stack<Integer> stack,
                                List<Integer>[] graphic,int curNode){
         if(localMarked[curNode]){
             return true;
         }
         if(globalMarked[curNode]){
             return false;
         } 
         localMarked[curNode] = true;
         globalMarked[curNode] = true;
         for(int nextNode:graphic[curNode]){
             if(hasCycle(globalMarked,localMarked,stack,graphic,nextNode)){
                 return true;
             }
         }
         stack.push(curNode);
         localMarked[curNode]= false;
         return false;
    }
}