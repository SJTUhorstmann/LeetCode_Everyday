class MyQueue {

    Stack<Integer> stack;
    public MyQueue() {
        stack=new Stack<Integer>();
    }
    public void push(int x) {
        Stack<Integer> stackAuxi = new Stack<Integer>();
        while(!stack.empty()) {
            stackAuxi.push(stack.pop());
        }
        stack.push(x);
        while(!stackAuxi.empty()) {
            stack.push(stackAuxi.pop());
        }
    }
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop(); 
    }
    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */