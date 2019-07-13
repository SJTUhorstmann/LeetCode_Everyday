class MinStack {
     Stack<Integer> stack;
     Stack<Integer> min;
    
    public MinStack() {
     stack = new Stack<Integer>();
     min=new Stack<Integer>();
    }
    
    public void push(int x) {
      stack.push(x);
      if(min.isEmpty()){
          min.push(x);
      }
      else if(min.peek()>=x){
          min.push(x);    
      }
    }
    public void pop() {
      int pop=stack.pop();
      if(!min.isEmpty() && pop==min.peek()){
          min.pop();
      }
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */