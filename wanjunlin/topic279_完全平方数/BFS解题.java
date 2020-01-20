class Solution {
    public int numSquares(int n) {
        List<Integer> squares = generateSquares(n);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        boolean[] hasVisited = new boolean[n+1];
        hasVisited[n]= true;
        int level=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            level++;
            while(size-->0){
                int num = queue.poll();
                for(int square:squares){
                    int next = num-square;
                    if(next==0){
                        return level;
                    }
                    if(next<0){
                        break;
                    }
                    if(hasVisited[next]){
                        continue;
                    }
                    hasVisited[next]=true;
                    queue.add(next);
                }
            }
        }
        return level;
    }
    public List<Integer> generateSquares(int n){
        List<Integer> squares = new ArrayList<>();
        int square = 1;
        int diff = 3;
        while(square<=n){
            squares.add(square);
            square+=diff;
            diff+=2;
        }
        return squares;
    }
}