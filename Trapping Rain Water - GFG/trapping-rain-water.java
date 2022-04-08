// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int a[], int n) { 
        
        Stack<Integer>st=new Stack<>();
        
        int rg[]=new int[n];
        
        rg[n-1]=-1;
        
        st.push(n-1);
        
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()>0 && a[st.peek()]<=a[i])
                st.pop();
            
            if(st.size()==0){
                rg[i]=-1;
                st.push(i);
            }
            else
            rg[i]=st.peek();
        }
        
        st.clear();
        
        int lg[]=new int[n];
        
        lg[0]=-1;
        
        st.push(0);
        
        for(int i=1;i<n;i++)
        {
            while(st.size()>0 && a[st.peek()]<=a[i])
                st.pop();
            
            if(st.size()==0){
                lg[i]=-1;
                st.push(i);
            }
            else
            lg[i]=st.peek();
        }

        long water=0;
        
        for(int i=0;i<n;i++)
        {
            int lb=lg[i];
            int rb=rg[i];
            
            if(lb!=-1 && rb!=-1)
            {
                long area=Math.min(a[lb],a[rb])-a[i];
                water+=area;
            }
        }
        return water;
    } 
}


