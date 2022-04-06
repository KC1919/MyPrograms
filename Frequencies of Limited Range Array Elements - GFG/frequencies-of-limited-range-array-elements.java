// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
        int t = Integer.parseInt(br.readLine().trim()); 
        while(t-->0){
            
            //size of array
            int N = Integer.parseInt(br.readLine().trim()); 
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for(int i = 0 ; i < N; i++){
                arr[i]=Integer.parseInt(inputLine[i]); 
            }
            int P= Integer.parseInt(br.readLine().trim());
            //calling frequncycount() function
            Solution ob = new Solution();
            ob.frequencyCount(arr, N, P); 
            
            //printing array elements
            for(int i = 0; i < N ; i++)
                System.out.print(arr[i] + " " );
            System.out.println();
        }
    }
}



// } Driver Code Ends


class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int a[], int n, int p)
    {
        int freq[]=new int[n+1];
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<=n)
            freq[a[i]]++;
        }
        
        for(int i=0;i<n;i++)
        a[i]=freq[i+1];
    }
}
