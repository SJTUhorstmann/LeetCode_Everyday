class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>();
        for (String d:deadends){
            dead.add(d);
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        queue.offer(null);
        Set<String> seen = new HashSet<>();
        seen.add("0000");
        int depth = 0;
        while(!queue.isEmpty()){
            String str = queue.poll();
            if(str==null){
                depth++;
                if(queue.peek()!=null){
                    queue.offer(null);
                }
            }else if(str.equals(target)){
                return depth;
            }else if(!dead.contains(str)){
                for(int i=0;i<4;i++){
                    for (int d=-1;d<=1;d+=2){
                        int j = ((str.charAt(i)-'0')+d+10)%10;
                        String newstr = str.substring(0,i)+(""+j)+str.substring(i+1);
                        if(!seen.contains(newstr)){
                            queue.offer(newstr);
                            seen.add(newstr);
                        }
                    }
                }
            }
        }
        return -1;
    }
}