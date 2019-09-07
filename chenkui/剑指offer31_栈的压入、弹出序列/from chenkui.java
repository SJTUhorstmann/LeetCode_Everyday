import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack =new Stack<Integer>();
        int tem=0;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while(!stack.empty() && stack.peek()==popA[tem]){
                 stack.pop();
                 tem++;
            }
        }
        return stack.empty();
    }
}