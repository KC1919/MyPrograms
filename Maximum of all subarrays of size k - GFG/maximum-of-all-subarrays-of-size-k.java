// { Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])
    {
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking total count of testcases
        int t = sc.nextInt();
        
        
        
        while(t-- > 0)
        {
            //taking total number of elements
            int n = sc.nextInt();
            
            //taking size of subArrays 
            int k = sc.nextInt();
            
            //Declaring and Intializing an array of size n
            int arr[] = new int[n];
            
            //adding all the elements to the array 
            for(int i = 0; i <n; i++)
            {
                arr[i] =sc.nextInt();
            }
            
            //Calling the method max_of_subarrays of class solve
            //and storing the result in an ArrayList
            ArrayList <Integer> res = new Solution().max_of_subarrays(arr, n, k);
            
            //printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int a[], int n, int k)
    {
        Stack<Integer>st=new Stack<>();
        ArrayList<Integer>list=new ArrayList<>();
        int rg[]=new int[a.length];
        st.push(a.length-1);
        rg[a.length-1]=-1;
        
        for(int i=a.length-2;i>=0;i--)
        {
            while(st.size()!=0 && a[i]>=a[st.peek()])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                rg[i]=-1;
            }
            else
            {
                rg[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        
        for(int i=0;i<a.length;i++)
        {
            int c=i;
            
            while(c!=(c+k) && (i+k-1)<a.length)
            {
                if(rg[c]>(i+k-1) || rg[c]==-1)
                {
                    list.add(a[c]);
                    break;
                }
                else
                {
                    c=rg[c];
                }
            }
            
        }
        return list;
    }
}