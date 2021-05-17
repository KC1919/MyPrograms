import java.util.*;
class nextGreat
{
    static Scanner sc=new Scanner(System.in);
    
    static void nextGreater(int a[])
    {
        Stack<Integer> st=new Stack<>();  //we take a stack
        
        int ng[]=new int[a.length];   //we take an array to store the next sgreater element of all the elements
        
        st.push(a[a.length-1]);    //initially we push the last element in the stack
        
        ng[a.length-1]=-1;  //we store the next greater of the last element as -1, as there is no element after the last element
        
        for(int i=a.length-2;i>=0;i--)  //now we start from the 2nd last element
        {
            while(st.size()!=0 && a[i]>=st.peek())  //we check, if the stack is not empty and there are elements smaller than the ith element
            {
                st.pop();                   //if present we pop, till we get a greater element than a[i]
            }
            if(st.size()==0)   //we the stack gets empty, means no greater element was there in the stack
            {
                ng[i]=-1;   //so the next greater to ith element becomes -1
            }
            
            else
            {
                ng[i]=st.peek();  //else next greater of the current element found in the stack
            }
            st.push(a[i]);  //and we push the current element
        }
                                    //so when all the elements have been visited, we got the next greater of all of them
        for(int i=0;i<ng.length;i++)
        {
            System.out.println("Next greater of:"+a[i]+" is "+ng[i]);  //so one by one print the next greater of all the elements
        }
    }
    
    public static void main(String args[])
    {
        System.out.println("enter size of the array: ");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        
        System.out.println("enter elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        nextGreater(a);
    }
}
            
            