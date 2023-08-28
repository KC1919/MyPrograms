class MyStack {

    LinkedList<Integer>que;
    public MyStack() {
        que=new LinkedList<>();
    }
    
    public void push(int x) {
        que.addFirst(x);
    }
    
    public int pop() {
        if(!que.isEmpty()){
            return que.removeFirst();
        }
        return -1;
    }
    
    public int top() {
        return que.peek();
    }
    
    public boolean empty() {
        return que.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */