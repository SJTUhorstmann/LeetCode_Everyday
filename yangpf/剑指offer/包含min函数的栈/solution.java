import java.util.Stack;
 
public class Solution {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    int min=Integer.MAX_VALUE;
     
    public void push(int node) {
        stack.push(node);
        min=minStack.isEmpty()?node:Math.min(minStack.peek(),node);
        minStack.push(min);
    }
     
    public void pop() {
        stack.pop();
        minStack.pop();
    }
     
    public int top() {
        return stack.peek();
    }
     
    public int min() {
        return minStack.peek();
    }
}