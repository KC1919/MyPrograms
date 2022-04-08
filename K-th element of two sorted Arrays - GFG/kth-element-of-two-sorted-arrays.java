// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    public long kthElement( int a1[], int a2[], int n, int m, int k) {
        
        if(a1.length>a2.length)
            return kthElement(a2,a1,m,n,k);
        
        int l1=-1, l2=-1, r1=Integer.MAX_VALUE, r2=Integer.MAX_VALUE;
        int c1=0, c2=0;
        
        if(n>=k){
            l1=a1[k-1];
            c1=k; //cut 1 in the 1st array
        }
        
        else
            c1=n;
            
            c2=k-c1;  //cut 2 in the 2nd array
        
        while(c1+c2<=k)
        {
            l1=c1==0?-1:a1[c1-1]; //storing the greatest value in the left slice of the 1st subarray
            l2=c2==0?-1:a2[c2-1]; //storing the greatest value in the left slice of the 2nd subarray
            r1=c1>=n?Integer.MAX_VALUE:a1[c1]; //storing the smallest value in the right slice of the 1st subarray
            r2=c2>=m?Integer.MAX_VALUE:a2[c2]; //storing the smallest value in the right slice of the 2nd subarray
            
            //cehcking if the left slices we have are completly sorted
            if(l1<=r2 && l2<=r1)  
            return Math.max(l1,l2);  //if yes then the max among the greatest among the left slice of both the subarray is the answer
            
            else if(l1>r2){  //else if the last value of the 1st left slice is greater than the 1st value of the 2nd right slice
                c1--;    //it means the left portion is not sorted, so we move cut pointers to make new slices
                c2++;
            }
            
            else if(l2>r1){  //we do the same if the last value of 2nd left slice is greater than the 1st value of 1 right slice
                c2--;
                c1++;
            }
        }
        return 1;
    }
}