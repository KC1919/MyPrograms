import java.util.*;
class minStack 
{

    
    static Stack<Integer> st=new Stack<>();
    static Stack<Integer> ms=new Stack<>(); //stack to maintain the minimum element present in tha stack
    
    public void push(int x) 
    {
        st.push(x);   //pushing the element in main stack
        if(ms.size()==0)  //if the min stack size is empty, push the element
            ms.push(x);
        
        else if(x<=ms.peek()) //else if the element to be pushed is smaller then the min element
        {
            ms.push(x); //we push the min element into the min stack
        }
    }
    
    public void pop() 
    {
        
        int k=st.pop(); //we store the pop element
        if(k==ms.peek())  //we check if the element being popped, is presently the minimum element in the minimum stack
        {
            ms.pop();  //if so we pop the element from both the stack
        }
    }
    
    public int top() 
    {
        return st.peek();
    }
    
    public int getMin()  //returns the current minimum element in the stack
    {
        return ms.peek();
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