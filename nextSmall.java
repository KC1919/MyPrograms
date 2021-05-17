import java.util.*;
class nextSmall
{
    static Scanner sc=new Scanner(System.in);
    
    static void nextSmaller(int a[])
    {
        Stack<Integer> st=new Stack<>();  //we take a stack
        
        int ns[]=new int[a.length];   //we take an array to store the next smaller element of all the elements
        
        st.push(a[a.length-1]);    //initially we push the last element in the stack
        
        ns[a.length-1]=-1;  //we store the next smaller of the last element as -1, as there is no element after the last element
        
        for(int i=a.length-2;i>=0;i--)  //now we start from the 2nd last element
        {
            while(st.size()!=0 && a[i]<=st.peek())  //we check, if the stack is not empty and there are elements greater than the ith element
            {
                st.pop();                   //if present we pop, till we get a smaller element than a[i]
            }
            if(st.size()==0)   //we the stack gets empty, means no smaller element was there in the stack
            {
                ns[i]=-1;   //so the next smaller to ith element becomes -1
            }
            
            else
            {
                ns[i]=st.peek();  //else next smaller is the element found smaller in the stack
            }
            st.push(a[i]);  //and we push the current element
        }
                                    //so when all the elements have been visited, we got the next smaller of all of them
        for(int i=0;i<ns.length;i++)
        {
            System.out.println("Next smaller of:"+a[i]+" is "+ns[i]);  //so one by one print the next smaller of all the elements
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
        
        nextSmaller(a);
    }
}
            
            