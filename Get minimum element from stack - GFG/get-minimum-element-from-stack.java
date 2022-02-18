// { Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}


// } Driver Code Ends


class GfG
{
    int minEle=0;
    Stack<Integer> st=new Stack<>();

    /*returns min element from stack*/
    int getMin()
    {
        if(st.size()==0)
        return -1;
        
	    return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
        if(st.size()!=0)
        {
            if(st.peek()>=minEle)
    	    return st.pop();
    	
        	else if(st.peek()<minEle)
        	{
        	    int popped=minEle;
        	    minEle=(2*minEle)-st.pop();
        	    return popped;
        	}
        	else return -1;
        }
        else
        return -1;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	    if(st.size()==0)
	    {
	        st.push(x);
	        minEle=x;
	    }
	    
	    else
	    {
	        if(x>=minEle)
	        {
	            st.push(x);
	        }
	        else
	        {
	            int push=x+(x-minEle);
	            minEle=x;
	            st.push(push);
	        }
	    }
    }	
}

