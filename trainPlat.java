// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class trainPlat
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Platform().findPlatform(arr, dep, n));
        }
    }
    
    
}


// } Driver Code Ends


//User function Template for Java

class Platform
{
    static int findPlatform(int a[], int d[], int n)
    {
        Arrays.sort(a);
        Arrays.sort(d);
        
        int i=1,j=0;
        int count=1,max=1;
        
        while(i<n && j<n)
        {
            if(a[i]<=d[j])  //if arrival time is less than or equal to the departure time,
            {
                count++;      //then we increment the count of required platforms, because the platform would be occupied by the already standing train
                i++;          //so a new platform would be required for the arriving train
            }
            
            else if(d[j]<a[i])  //if the arrival time is greater than the departure time 
            {
                count--;     //then we decrement the no. of platform required, becoz, when a train leaves the platform becomes empty, so it can be used
                j++;         //instead of a new platform
            }
            
            max=Math.max(count,max);  //we store the maximum requirement of platform reached ,throughout the day
        }
        return max;             //and return the maximum count
        
    }
    
}

