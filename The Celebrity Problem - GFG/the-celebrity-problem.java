// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int a[][], int n)
    {
    	Stack<Integer>st=new Stack<>();
    	
    	for(int i=0;i<n;i++)
    	st.push(i);
    	
    	int cand=potentialCand(st,a);
    	
    	if(cand==-1)return -1;
    	
    	for(int i=0;i<n;i++)
    	{
    	    if(i!=cand && (a[i][cand]!=1 || a[cand][i]!=0))
    	    return -1;
    	}
    	return cand;
    }
    
    //here we find the potential candidate
    int potentialCand(Stack<Integer>st, int mat[][])
    {
        while(st.size()!=1) //we check till we are left with only one candidate int the stack
        {
            //we take out two elements from the stack
            int a=st.pop(); 
            int b=st.pop();
            
            if(mat[a][b]==1 && mat[b][a]==1)
            continue;
            
            //check if a knows b, if true means a is not a celebrity b might be
            if(mat[a][b]==1){ //so we push b back to the stack
                st.push(b);
            }
            
            //check if b knows a, if true means b is not a celebrity a might be
            else if(mat[b][a]==1){//so we push a to the stack
                st.push(a);
            }
        }
        return st.size()==0?-1:st.peek(); //returning the last candidate left
    }
}